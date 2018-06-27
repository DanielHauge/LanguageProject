
import java.util.HashSet


class Problem1(var list: Array<Int>, var k: Int, var exp: Boolean) : Problem {


    override fun Calculate(): Boolean {
        var res = false
        val set = HashSet<Int>()
        for (i in list) {
            if (set.contains(i)) {
                res = true
            } else {
                set.add(k - i)
            }
        }

        return res==exp
    }
}