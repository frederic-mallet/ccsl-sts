package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Event;
import fr.aoste.sync.Transition;
import fr.kairos.common.binaryword.BinaryWordFactoryFactory;
import fr.kairos.common.binaryword.IBinaryWord;

/**
 * Maintains a structure that allows the product of transitions
 * 
 * @author fmallet
 *
 */
class SyncVectorToBinaryWordMap {
	private IBinaryWord[] words;
	private HashMap<SyncVector<? extends IEvent>, Integer> vectorMap = new HashMap<>();
	private HashMap<Transition, IBinaryWord> transitionMap = new HashMap<>();
	private List<SyncVector<? extends IEvent>> listVector = new ArrayList<>();

	SyncVectorToBinaryWordMap(int size) {
		words = new IBinaryWord[size];
	}

	void buildBinaryWord(int pos, List<Event> eventList) {
		or(pos, getBinaryWord(eventList));
	}
	void or(int stsNb, IBinaryWord word) {
		if (words[stsNb]==null) words[stsNb]=word;
		else words[stsNb] = BinaryWordFactoryFactory.getFactory().or(words[stsNb], word);
	}
	IBinaryWord xor(int stsNb, IBinaryWord word) {
		if (words[stsNb]==null) return word;
		else return BinaryWordFactoryFactory.getFactory().xor(words[stsNb], word);
	}
	void add(SyncVector<? extends IEvent> vec) {
		vectorMap.put(vec, listVector.size());
		listVector.add(vec);
	}
	int getPosition(SyncVector<?> vec) {
		return vectorMap.get(vec);
	}
	
	IBinaryWord getBinaryWord(Transition t) {
		if (t==null) return BinaryWordFactoryFactory.getFactory().createBinaryWord(0, listVector.size());
		IBinaryWord tWord = transitionMap.get(t);
		if (tWord==null) {
			tWord = getBinaryWord(t.getTrigger().getEvents());
			transitionMap.put(t, tWord);
		}
		return tWord;
	}
	IBinaryWord synchronize(Transition t, int stsNb) {
		return BinaryWordFactoryFactory.getFactory().and(getBinaryWord(t), words[stsNb]);
	}
	private IBinaryWord getBinaryWord(List<Event> eventList) {
		IBinaryWord res = BinaryWordFactoryFactory.getFactory().createBinaryWord(0, listVector.size());
		for(Event ev : eventList) {
			IBinaryWord w = BinaryWordFactoryFactory.getFactory().twoToThePowerOf(vectorMap.get(ev.getSync()), listVector.size());
			res = BinaryWordFactoryFactory.getFactory().or(res, w);
		}
		return res;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(SyncVector<? extends IEvent> vec : listVector) 
			sb.insert(0,vec.getName());
		
		for(IBinaryWord word : words) {
			sb.append(' ').append(word);
		}
		return sb.toString();
	}
}
