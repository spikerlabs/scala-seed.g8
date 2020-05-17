[![Build Status](https://travis-ci.org/spikerlabs/scala-bdd-seed.g8.svg?branch=master)](https://travis-ci.org/spikerlabs/scala-bdd-seed.g8)

# Scala Seed Project

Scala seed project using sbt dependency manager (with cucumber plugin), cucumber for bdd cycle and scalatest+scalacheck for tdd cycle.
This is a  [Giter8][g8] template, which integrates beatifully with [sbt][sbt].



## Requirements

You have to have latest `scala` and `sbt` available on your system.
On a mac you can get it via:
```bash
brew install scala
brew install sbt
```

## How to set up

```bash
sbt new spikerlabs/scala-seed.g8
```

It will install in sub directory (using the project name you choose).

The template will ask number of questions about desired versions of things, normally you should be fine to use defaults.

## How to use generated project

All the code and tests are hello world, but suggested structure is scalable towards complex real life project.

Upon completion, you can run all example tests via

```bash
sbt test cucumber
```

Examples:
- feature specification: [src/test/resource/features/hello_world.feature](src/main/g8/src/test/resources/features/hello_world.feature)
- feature implementation: [src/test/scala/features/RuntimeMemoryContext.scala](src/main/g8/src/test/scala/features/RuntimeMemoryContext.scala)
- unit specification: [src/test/scala/example/GreeterSpec.scala](src/main/g8/src/test/scala/example/GreeterSpec.scala#L9-L15)
- property test: [src/test/scala/example/GreeterSpec.scala](src/main/g8/src/test/scala/example/GreeterSpec.scala#L17-L21)
- unit implementation: [src/main/scala/example/Greeter.scala](src/main/g8/src/main/scala/example/Greeter.scala)

[g8]: https://www.foundweekends.org/giter8/
[sbt]: https://www.scala-sbt.org
