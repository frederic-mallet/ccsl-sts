# JAR Libraries
## Core files
- lccsl-core.jar [required] : Contains the core files for Light-CCSL.

## Solvers
- sat-sat4j.jar [optional] : Contains a CCSL solver that relies on SAT4J solver
- sat-bdd.jar [optional] : Contains a CCSL solver that relies on a personal BDD library
- sts-legacy.jar [optional] : CCSL solver that encodes CCSL constraint as Automata. The code of this library is available in this repository.

## Backends
- html.jar [optional] : Contains a backend to produce a time trace as an HTML file
  - depends on [common/html](../common)
- vcd.jar [optional] : Contains a backend to produce a time trace as a VCD file
  - depends on [common/vcd](../common)
