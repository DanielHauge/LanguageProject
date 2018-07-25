class Problem2(var list: Array<Int>, var exp: Array<Int>) : Problem {
    override fun Calculate(): Boolean {
        var result = IntArray(list.size)
        for (i in 0..list.size-1){


            var total: Int = 1
            for (j in 0..list.size-1){

                if (j!= i){
                    total *= this.list[j]
                }

            }

            result[i]=total


        }

        return true
    }


}