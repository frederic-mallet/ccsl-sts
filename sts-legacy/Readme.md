# Synchronized Transition Systems (STS) legacy

Contains the main source files for compiling CCSL into Automata (Synchronized Transition Systems - STS).
The binary files are availables in [sts-legacy.jar](../dependencies/jar/) 

- ccsl-core : legacy encoding of CCSL and plenty of utilities
- sts-pojo : contains the code to handle the Synchronized Transition Systems
  - src-texo : are automatically generated from a model. They mainly contain the data structure of STS
  - src : written manually
    - compose : contains the code for composing several STS and synchronize them
    - dynamic : contains a runner to execute the synchronized automata while keeping them in parallel
 - sts-utility : facade to use the code from sts-pojo as part of the LightCCSL Eclipse Environment. Can be used also as standalone Java library   
 
