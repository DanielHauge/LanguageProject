import kotlin.system.measureNanoTime

class Experimenter {

    fun RunExperiment(problem: Problem): ExperimentResult{

        println("Running experiment on: "+ problem.javaClass.name)

        var measurements = mutableListOf<Long>()

        for (i in 1..100000){
            var value = false
            var time = measureNanoTime {
                value = problem.Calculate()
            }
            measurements.add(time)
            if (!value){
                println("Algorithm failed")
            }
        }


        return ExperimentResult(problem.javaClass.name, measurements.toLongArray(), Avg(measurements.toLongArray()), Med(measurements.toLongArray()), High(measurements.toLongArray()), Low(measurements.toLongArray()));
    }


    private fun Avg(numbers: LongArray): Double {
        /*
        var total = 0L
        for (number in numbers){
            total += number
        }
        return total/numbers.size
        */

        return numbers.average()
    }

    private fun Med(numbers: LongArray): Long {
        numbers.sort()
        return numbers[numbers.size/2]
    }

    private fun High(numbers: LongArray): Long {
        numbers.sort()
        return numbers[numbers.size-1]
    }

    private fun Low(numbers: LongArray): Long {
        numbers.sort()
        return numbers[0]
    }


    fun AverageOfAverage(results: Array<ExperimentResult>):Double{

        var total: Double = 0.0
        for (result in results){
            total += result.avg
        }
        return total / results.size
    }
    fun AverageOfMedian(results: Array<ExperimentResult>):Double{

        var total: Double = 0.0
        for (result in results){
            total += result.med
        }
        return total / results.size
    }
    fun AverageOfHigh(results: Array<ExperimentResult>):Double{

        var total: Double = 0.0
        for (result in results){
            total += result.h
        }
        return total / results.size
    }
    fun AverageOfLow(results: Array<ExperimentResult>):Double{

        var total: Double = 0.0
        for (result in results){
            total += result.l
        }
        return total / results.size
    }

    fun PrintAverages(results: Array<ExperimentResult>){

        println("Printint Averages on: "+ results[0].Problem)
        println("Average-Average: "+Math.round(AverageOfAverage(results))+"ns")
        println("Average-Median: "+Math.round(AverageOfMedian(results))+"ns")
        println("Average-High: "+Math.round(AverageOfHigh(results))+"ns")
        println("Average-Low: "+Math.round(AverageOfLow(results))+"ns")


    }

    fun PrintIndi(results: Array<ExperimentResult>){
        for (result in results){
            result.PrintMe()
        }
    }



}