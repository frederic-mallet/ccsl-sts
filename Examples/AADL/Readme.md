# AADL example

Example taken from FDL 2007.

![FDL](Aadl.png)

The CCSL specification is [simple](lc/aadl1.lc).

Looking at causality graph with identify that the specification is not safe since the counter-arc (in red) is not in a cycle.

![CCG](dot/Aadl1.dot.png)

A simple interactive execution is given [here](vcd/Aadl1.html)

But computing the [Synchronous Transition Systems](sts/Aadl1.dot.png) results in  39 states and 949 transitions.

- [FDL2007](https://web.archive.org/web/*/http://www.ecsi-association.org/ecsi/main.asp?l1=library&fn=def&id=265): F. Mallet, C. André, R. de Simone: *Modeling of immediate vs. delayed data communications: from AADL to UML Marte.* FDL 2007: 249-254.

