package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Event;
import fr.aoste.sync.Transition;

/**
 * Maintains a structure that allows the product of transitions
 * Replacing SyncVectorToIBinaryWordMap for performance reasons
 * 
 * @see SyncVectorToIBinaryWordMap
 * 
 * @author fmallet
 *
 */
class SyncVectorToIntMap {
	private int[] words;
	private HashMap<SyncVector<? extends IEvent>, Integer> vectorMap = new HashMap<>();
	private HashMap<Transition, Integer> transitionMap = new HashMap<>();
	private List<SyncVector<? extends IEvent>> listVector = new ArrayList<>();

	SyncVectorToIntMap(int size) {
		words = new int[size];
	}

	void buildBinaryWord(int pos, List<Event> eventList) {
		or(pos, getBinaryWord(eventList));
	}
	void or(int stsNb, int word) {
		words[stsNb] |= word;
	}
	int xor(int stsNb, int word) {
		int tmp = words[stsNb] | word;
		return tmp - (words[stsNb] & word);
	}
	void add(SyncVector<? extends IEvent> vec) {
		vectorMap.put(vec, listVector.size());
		listVector.add(vec);
	}
	int getPosition(SyncVector<?> vec) {
		return vectorMap.get(vec);
	}
	
	int getBinaryWord(Transition t) {
		if (t==null) return 0;
		Integer tWord = transitionMap.get(t);
		if (tWord==null) {
			tWord = getBinaryWord(t.getTrigger().getEvents());
			transitionMap.put(t, tWord);
		}
		return tWord;
	}
	int synchronize(Transition t, int stsNb) {
		return getBinaryWord(t) & words[stsNb];
	}
	private int getBinaryWord(List<Event> eventList) {
		int res = 0;
		for(Event ev : eventList) {
			res |= 1<<vectorMap.get(ev.getSync());
		}
		return res;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(SyncVector<? extends IEvent> vec : listVector) 
			sb.insert(0,vec.getName());
		
		for(Integer word : words) {
			sb.append(' ').append(word);
		}
		return sb.toString();
	}
}
