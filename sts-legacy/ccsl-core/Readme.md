# fr.aoste.ccsl.core

**Author: ** F. Mallet

**Date: ** 2014

## fr.aoste.ccsl.core

**Source:** [fr.aoste.ccsl.core](src/fr/aoste/ccsl/core)

Main abstract definition of a [CCSL Specification](src/fr/aoste/ccsl/core/ICCSLSpecification.java). Since 2014, a new model is proposed with ISimpleSpecification. See fr.inria.aoste.timesquare.safety.core on TimeSquare repository.

This structure is still in used for STS-based representations.

Most of the time we try not to serialize the model but to deal with it on-the-fly.
When Serialization is required, fr.aoste.ccsl.basic proposes a basic generic implementation

## fr.aoste.ccsl.basic

**Source:** [fr.aoste.ccsl.basic](src/fr/aoste/ccsl/basic)

Basic and generic data structure for serialization and visit of a [ICCSLSpecification](src/fr/aoste/ccsl/core/ICCSLSpecification.java).

In many cases, this data structure is not appropriate and the operation is done on the fly or with an adequate data structure.