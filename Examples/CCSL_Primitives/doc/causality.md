# The Clock Constraint Specification Language

[Main](../Readme.md)

## Causality

[src](../lc/BoundedCausality.lc) [simul](../vcd/BoundedCausality.html)

- **Causality** is a weakest form of precedence that allows for a and b to tick exactly at the same rhythm, an unbounded FIFO. The bounded form restrict the advance that a can have over b (a bounded FIFO of size max). Init allows for initializing the FIFO with an initial number of tokens.

<center>
<img alt="bcauses" src="../sts/BoundedCausality.png" height="200px"/><br>
<strong>a <= (init: 2 max: 3) b : </strong>a causes b 
</center>
