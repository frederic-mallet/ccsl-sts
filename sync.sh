#!/bin/bash
rsync -a ~/git/light-ccsl/SynchronousTransitionSystems/sts-legacy .
rsync -a ~/src/jar/externalJar/lccsl/ dependencies/jar/
rsync -a ~/src/jar/externalJar/common dependencies/
