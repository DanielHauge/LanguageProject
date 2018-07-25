import java.util.HashSet

class Problem3(var list: Array<Int>, var k: Int) : Problem {
    override fun Calculate(): Boolean {
        var counter: Int = 0
        val set = HashSet<Int>()
        for (num in list){
            if (num == counter+1){
                counter++
                while (set.contains(counter+1)){
                    counter++
                }
            } else{
                set.add(num)
            }
        }

        return counter+1==this.k
    }
}