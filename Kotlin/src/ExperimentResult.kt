class ExperimentResult(var Problem: String, var mes: LongArray, var avg: Double, var med: Long, var h: Long, var l: Long) {

    fun PrintMe(){
        println(Problem+" results: ")
        println("Median: "+med+"ns")
        println("Average: "+avg+"ns")
        println("High: "+h+"\t\tLow: "+l)
        println("======================\n")
    }


}