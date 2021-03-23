# Synchronized Transition Systems (STS) legacy

Contains the main source files for compiling CCSL into Automata (Synchronized Transition Systems - STS).
The binary files are availables in [sts-legacy.jar](../dependencies/jar/) 

- **[ccsl-core](ccsl-core/):** legacy encoding of CCSL : required to generate .extendedCCSL
- **[ccsl-system](ccsl-system/):** legacy encoding of CCSL that supersedes ccsl-core  (most of the time) and plenty of utilities
- **[ccsl-adapter](ccsl-adapter/):** Adapter from CCSL-CORE to CCSL-SYSTEM to reuse constructs of CCSL-CORE with CCSL-SYSTEM
- **[sts-pojo](sts-pojo/):** contains the code to handle the Synchronized Transition Systems
  - *src-texo:* are automatically generated from a model. They mainly contain the data structure of STS
  - *src:* written manually
    - compose : contains the code for composing several STS and synchronize them
    - dynamic : contains a runner to execute the synchronized automata while keeping them in parallel
 - **[sts-utility](sts-utility):** facade to use the code from sts-pojo as part of the LightCCSL Eclipse Environment. Can be used also as standalone Java library   
 
