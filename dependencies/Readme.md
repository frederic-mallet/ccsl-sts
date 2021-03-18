lightccsl-feature.zip contains a list of Eclipse features and plugins to be installed into Eclipse.
Those plugins depend on the modeling package of Eclipse and requires XText plugins to work

The jar directory contains the dependencies to be used at runtime to run the produced Java code

# User libraries

## lccsl-core

- name : lccsl-core
- external-jar : jar/lccsl-core.jar
- description : minimal dependency for executing an empty generated Java file

## lccsl-html

- name : lccsl-html
- external-jar : jar/html-0.1.jar common/html-0.1.jar
- description : Useful if the backend is HTML

## lccsl-vcd

- name : lccsl-vcd
- external-jar : jar/vcd-0.1.jar common/vcd-0.1.jar
- description : Useful if the backend is VCD

## sat-bdd-lcssl

- name : sat-bdd-lccsl
- external-jar : jar/sat-bdd-0.1.jar common/mybdd-0.1.jar
- description : Useful if the solver is BDD 

## sts-legacy

- name : sts-legacy
- external-jar : jar/sts-legacy-0.1.jar common/java-0.1.jar
- description : Useful if the solver is STS or if one of the STS generators is activated 

