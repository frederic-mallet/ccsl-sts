# COMMON libraries

Those are basic libraries used by Light-CCSL

- html.jar : used to produce HTML files (used at least by the [HTML backend](../jar))
- vcd.jar : used to produce VCD files (used at least by the [VCD backend](../jar))
- binaryWord.jar : used to handle integers encoded as binary words (used at least by the [STS solver](../jar))
- mybdd.jar : internal library of Binary Decision Diagrams (BDD) (used at least by the [BDD solver](../jar)) 
- java.jar : internal library to generate prettify Java code (used at least by the [STStoJava generator](../jar)) 

Thoses libraries should be added (or not) depending on the features that are actually used
