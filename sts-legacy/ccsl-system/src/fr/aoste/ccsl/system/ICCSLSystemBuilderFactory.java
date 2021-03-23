package fr.aoste.ccsl.system;

/**
 * A Factory for ICCSLSystemBuilder
 * 
 * @author fmallet
 *
 */
public interface ICCSLSystemBuilderFactory {
	ICCSLSystemBuilder<?> createSystemBuilder();
}
