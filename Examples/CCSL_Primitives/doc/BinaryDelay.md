# The Clock Constraint Specification Language

[Main](../Readme.md)

## Binary Delay

[src](../lc/BinaryDelay.lc) [simul](../vcd/BinDelay.html)

- The binary delay is a synchronous constraints that delay the ticks of a clock of some steps. If `b = a $ n`, **b** is synchronous with **a** starting from its n<sup>th</sup> tick. As a consequence **b** is slower than **a** or equal if **n=0**.

<center>
<img alt="bindelay" src="../sts/BinDelay.dot.png" width="60%"/><br>
<strong> b = a $ 5</strong> 
</center>
