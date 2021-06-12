# CCSL Primitives

The [Clock Constraint Specification Language](https://en.wikipedia.org/wiki/Clock_Constraints_Specification_Language) is a synchronous language defined in 2008 as part of the [OMG UML Profile for MARTE](https://www.omg.org/omgmarte/).

- Mallet, F., André, C., and de Simone, R. 2008. [CCSL: specifying clock constraints with UML/Marte](https://doi.org/10.1007/s11334-008-0055-2). Innovations in Systems and Software Engineering 4, 3, 309–314.

The initial [operational semantics](https://hal.inria.fr/inria-00384077v2) has been defined with rewriting rules in 2009 by Charles André.

This document presents its primitives and their semantics.

## Logical Clock

A logical clock represents repetitive events independently of a notion of physical time. They extend the logical clocks of Leslie Lamport with synchronous relations as classically used in Synchronous languages.

## Relations

The relations of CCSL constrains the logical clocks by defining instants where clocks cannot tick.

- [Precedence](doc/precedence.md)
- [Causality](doc/causality.md)
- [Subclock](doc/subclock.md)
- Exclusion

## Expressions

Expressions build new clocks based on existing ones

- [Union](doc/UnionIntersection.md) : The union of n clocks `{c_1, ..., c_n}` ticks if and only if any of the clock **c_i** ticks. 
- [Intersection](doc/UnionIntersection.md) : The intersection of n clocks `{c_1, ..., c_n}` ticks if and only if all the clocks **c_i** tick simultaneously. 
- [Binary Delay](doc/BinaryDelay.md)
 