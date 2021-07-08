# CCSL Primitives

The [Clock Constraint Specification Language](https://en.wikipedia.org/wiki/Clock_Constraints_Specification_Language) is a synchronous language defined in 2008 as part of the [OMG UML Profile for MARTE](https://www.omg.org/omgmarte/).

- Mallet, F., André, C., and de Simone, R. 2008. [CCSL: specifying clock constraints with UML/Marte](https://doi.org/10.1007/s11334-008-0055-2). Innovations in Systems and Software Engineering 4, 3, 309–314.

The initial [operational semantics](https://hal.inria.fr/inria-00384077v2) has been defined with rewriting rules in 2009 by Charles André.

The latest description of the denotational semantics has been produced a bit later:

- Deantoni, J., André C., Gascon R. 2014. [CCSL denotational semantics](https://hal.archives-ouvertes.fr/hal-01082274/). RR-8628, Inria. 

This document presents some illustrations of its primitives and their semantics.

## Logical Clocks

A logical clock represents repetitive events independently of a notion of physical time. They extend the logical clocks of Leslie Lamport with synchronous relations as classically used in Synchronous languages.

## Relations

The relations of CCSL constrains the logical clocks by defining instants where clocks cannot tick.

- [Precedence](doc/Precedence.md): It makes sure that a clock ticks faster than another one.
- [Causality](doc/causality.md): When an event causes another one or one depends on an earlier one.
- [Subclock](doc/subclock.md): Forces a clock to tick only when another (super) clock ticks.
- [Synchrony](doc/Synchrony.md): When a is a subclock of b and b a subclock of a, then a and b are synchronous. When a causes b and b causes a then a and b are also synchronous.
- [Exclusion](doc/Exclusion.md): Forbids n clocks to tick simultaneously pair-wise.

## Expressions

Expressions build new clocks based on existing ones

- [Union](doc/UnionIntersection.md): The union of n clocks `{c_1, ..., c_n}` ticks if and only if any of the clock **c_i** ticks. 
- [Intersection](doc/UnionIntersection.md): The intersection of n clocks `{c_1, ..., c_n}` ticks if and only if all the clocks **c_i** tick simultaneously. 
- [Binary Delay](doc/BinaryDelay.md): This expression is akin of having n buffers in sequence.
- [SampledOn](doc/SampledOn.md): Sampling is used to synchronize a clock on another one. 
- [Ternary Delay](doc/TernaryDelay.md): This expression resembles a shift register of size n.
- Infimum : The infimum of n clocks `{c_1, ..., c_n}` is the slowest clock that is faster than all of the clocks **c_i**.
- Supremum : The supremum of n clocks `{c_1, ..., c_n}` is the fastest clock that is slower than all of the clocks **c_i**.
 
