import kotlin.system.measureNanoTime

class Experimenter {

    fun RunExperiment(problem: Problem){

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

        println("Median: "+Med(measurements.toLongArray())+"ns")
        println("Average: "+Avg(measurements.toLongArray())+"ns")
        println()

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


}