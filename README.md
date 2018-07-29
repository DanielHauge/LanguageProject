# Dialects of computing
This is a repository for personal learning. 

## Introduction
The goal is to learn more languages in addition to measuring their speed and comfort level. It includes typical algorithms and some solutions to odd problems in many different languages.

### Intial Problem statement
Which language is fastest, easiest to learn and most comfortable (In my opinion), using mostly the standard tools and libraries the language provides.

Given a set of problems to solve by algorithms, how do each language compare in regards to:
- Runtime speed
- Coding comfortability
- Ease in building the algorithm

Runtime speed is the metric mainly in focus, as other metrics are kind of subjective.

### Hypothesis
Some of the lower level languages such as C and C++ is alot faster, but harder to implement correctly or even implement at all. Where as high level languages which has alot of abstraction such as Java or C# will be a little slower but very straight forward to implement. Each language has it's strenghs and weaknesses, and are built for different purposes. Allthough many claims to be "General-Purpose", each language still has it's intended uses where it's strong and will outcompete other languages.

Older languages is expected to have rich standard libraries having been nurtered over many years, where as newer languages might fall short. However, in some situations newer languages might actully provide better solutions than older ones because of the "Band-aid" fixes some languages has come to use because of the shortcommings of new innovative ideas in newer languages. This extends to documentation and tutorials aswell.

## Procedure
Each language will contain a module, class, procedure for running an experiment ([See example of experimenter module](https://github.com/DanielHauge/LanguageProject/blob/master/C%23/Problems/Problems/Experimenter.cs)). The experiment will be as follows: Execute, Solve, Compute a given problem case 100000 times. While measuring the time it takes each time. The measurement will be uniformly formated to nano seconds, and is not 100% accurate when it comes to fast algorithms, therefor the results should not be taken as de facto absoluts.

Each problem will get 3 or more cases to test different inputs and different sizes of input.

The measurements will be aggregated into: Average, Median, Highest runtime and Lowest runtime. Then aggregated even further to combine all cases for a problem. ie. Average of Averages, Average of Median etc.

- **NOTE**: The procedures are very influenced by OOP(Object oriented programming), therefor it can skewer the results towards favoring languages with good OOP support.

## Algorithms & problems
Note: All random numbers have been generated from [Random.org](https://www.random.org/), and all problems are from [Dailycodingproblem.com](https://www.dailycodingproblem.com/).

- [P1: Does any two values sum to k in a list?](https://github.com/DanielHauge/LanguageSpeed/blob/master/P1.md)
- [P2: Products of array except index](https://github.com/DanielHauge/LanguageSpeed/blob/master/P2.md)
- [P3: First missing integer in a linear time](https://github.com/DanielHauge/LanguageSpeed/blob/master/P3.md)


## Languages
- C#
- C++
- Golang
- Java
- JavaScript
- Kotlin
- Python
- Ruby
- Rust
- Scala
- Dart
- PHP

## Conclusion & Discussion
- JVM pre-calculate the answers before the actual call comes etc.
