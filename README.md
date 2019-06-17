# AudioTest

[![GitHub version](https://badge.fury.io/gh/mslinn%2FaudioTest.svg)](https://badge.fury.io/gh/mslinn%2FaudioTest)

Messing around with DSP on the JVM with Scala.

## Running the Program
The `bin/run` Bash script assembles this project into a fat jar and runs it.
Sample usage, which runs the `Hello` entry point in `src/main/scala/Hello.scala`:

```
$ bin/run AudioTest
```

The `-j` option forces a rebuild of the fat jar.
Use it after modifying the source code.

```
$ bin/run -j AudioTest
```
