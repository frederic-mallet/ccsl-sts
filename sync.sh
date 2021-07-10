#!/bin/bash
du -a > before.txt
rsync -a ~/git/light-ccsl/SynchronousTransitionSystems/sts-legacy .
rsync -a ~/src/jar/externalJar/*.jar dependencies/thirdparties/
rsync -a ~/src/jar/toools.jar dependencies/thirdparties/
rsync -a ~/src/jar/externalJar/lccsl/ dependencies/jar/
rsync -a ~/src/jar/externalJar/main/lccsl-main.jar dependencies/jar/
rsync -a ~/src/jar/externalJar/common dependencies/
rsync -a ~/src/jar/externalJar/bdd/mybdd* dependencies/common/
rsync -a ~/src/jar/myPlugins/lightccsl-feature.zip dependencies/
du -a > after.txt
diff -y --suppress-common-lines before.txt after.txt > diff.txt
rm before.txt after.txt
