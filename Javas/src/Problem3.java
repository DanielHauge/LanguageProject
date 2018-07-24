import java.util.HashSet;

public class Problem3 implements Problem {


    private int[] numbers;
    private int exp;

    public Problem3(int[] numbers, int expected)
    {
        this.numbers = numbers;
        this.exp = expected;
    }



    @Override
    public Boolean Calculate() {
        int counter = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : numbers)
        {
            if (num == counter + 1)
            {
                counter++;
                while (set.contains(counter + 1))
                {
                    counter++;
                }
            }
            else
            {
                set.add(num);
            }
        }

        return counter+1 == this.exp;
    }
}
