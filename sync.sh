#!/bin/bash
rsync -a ~/git/light-ccsl/SynchronousTransitionSystems/sts-legacy .
rsync -a ~/src/jar/externalJar/*.jar dependencies/thirdparties/
rsync -a ~/src/jar/toools.jar dependencies/thirdparties/
rsync -a ~/src/jar/externalJar/lccsl/ dependencies/jar/
rsync -a ~/src/jar/externalJar/common dependencies/
rsync -a ~/src/jar/externalJar/bdd/mybdd* dependencies/common/
rsync -a ~/src/jar/myPlugins/lightccsl-feature.zip dependencies/
