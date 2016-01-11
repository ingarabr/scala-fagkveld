# Into to Scala

## Intention
Learn some of the basis scala features and how the language differ from for
instance Java. The scala language have a lot of concept as part of the core
language. Most of the concepts can be applied in other languages even due 
you have to work for it. But good code does not come without work!

## Quick intro to sbt
sbt is bundled with this project to make the setup easy. It requires that 
java is on the classpath.

Compile the code:

> ./sbt compile

Run all the tests:

> ./sbt test

Run only one test:

> ./sbt "test-only path.to.my.TestClass"

By adding ~ in from of the command it will watch for changes. For example: 

> ./sbt "~test"

## Tasks 

You find all the tasks as specs under `src/test/scala/intro/`. There should be
enough information there to get you started.
