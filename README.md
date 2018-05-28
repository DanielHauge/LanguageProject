# Dialects of computing
This is a repository for personal learning. 

## Introduction
The goal is to learn more languages in addition to measuring their speed and comfort level. It includes typical algorithms and some solutions to odd problems in many different languages.

### Intial Problem statement
Which language is fastest, easiest to learn and most comfortable (In my opinion).

Given a set of problems to solve by algorithms, how do each language compare in regards to:
- Runtime speed
- Coding comfortability
- Ease in building the algorithm

Runtime speed is the metric mainly in focus, as other metrics are kind of subjective.

### Hypothesis
It is expected that some of the lower level languages such as C and C++ is alot faster. Where as high level languages which has alot of abstraction such as Java or C# might be a little slower. 

## Procedure
First is to build the algorithm, the goal is to construct the algorithms as identical in each language as possible. However it will be different from language to language. Then to make a single measurements of each case. It should be noted that the measurements can vary alot depending on how many times they are run. For instance, java. If running the algorithm multiple times, lets say 100000 times. The JVM will predict and pre-calculate the answers before the actual call comes. This will affect measurement results alot. But i'm only going to do a one off calculation, mainly to not exhastively benchmark and generate tons of overhead work, since it needs to be implemented in all languages. Perhaps later down the line. For the time being, run the algorithms on my own machine. Maybe with enviroment isolation later in the future. Then measure their speed in nanoseconds.

## Algorithms & problems
Note: All random numbers have been generated from [Random.org](https://www.random.org/)

- [P1: Does any two values sum to k in a list?](https://github.com/DanielHauge/LanguageSpeed/blob/master/P1Measurements.md)


## Languages
- C#
- Java
- Golang
- Python
- Ruby

## Results
Language/Problem | C# | Java | Golang | Python | Ruby
-------|:------:|:-------:|:------:|:-------:|:------:
Problem 1 | x | 27325ns | x | x | x

## Conclusion & Discussion
