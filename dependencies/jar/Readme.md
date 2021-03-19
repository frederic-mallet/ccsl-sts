# JAR Libraries
## Core files
- lccsl-core.jar [required] : Contains the core files for Light-CCSL.

## Solvers
- sat-sat4j.jar [optional] : Contains a CCSL solver that relies on SAT4J solver. If solver is SAT4J.
  - requires [sat4j-sat.jar](https://www.sat4j.org/)
- sat-bdd.jar [optional] : Contains a CCSL solver that relies on a personal BDD library. If solver is BDD.
  - requires [mybdd.jar](../common/) 
- sts-legacy.jar [optional] : CCSL solver that encodes CCSL constraint as Automata. The code of this library is available in this repository. if Solver is STS or STS code generator is activated.
  - requires [binaryWord.jar](../common/)
- sts-choco.jar [optional] : CCSL solver that encodes CCSL constraint with Choco Constraint solver. If solver is Choco.

## Invariant solvers
To reduce STS automata, you need to use constraint solvers:
- sts-choco: use choco solver to reduce invariants

## Backends
- html.jar [optional] : Contains a backend to produce a time trace as an HTML file. If backend is HTML.
  - depends on [common/html](../common)
- vcd.jar [optional] : Contains a backend to produce a time trace as a VCD file. If backend is VCD.
  - depends on [common/vcd](../common)
