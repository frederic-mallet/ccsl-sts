# The Clock Constraint Specification Language

[Main](../Readme.md)

## Alternates

[src](../lc/Alternates2.lc) [simul](../vcd/alt2.html)

- **Alternates** is just syntactic sugar to a bounded precedence. It is akin of a FIFO of size 1 with blocking read/write. 

<center>
<img alt="alternates" src="../sts/alternates.png" height = "80px"/><br>
<strong>a ~ b : </strong>a alternates b 
</center>