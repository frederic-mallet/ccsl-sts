# The Clock Constraint Specification Language

[Main](../Readme.md)

## Subclock

- **Subclock** is the basic synchronous clock (partial binary) relation that forbids a *subclock* to tick when its *superclock* cannot tick. Subclock does not say when the subclock or the superclock should tick, only when the subclock cannot tick. Other forms of constraints are used to built subclock with precise repetitive ticking patterns.
