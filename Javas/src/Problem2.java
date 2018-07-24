public class Problem2 implements Problem {


    private int[] numbers;
    private int[] expected;

    public Problem2(int[] numbers, int[] expected)
    {
        this.numbers = numbers;
        this.expected = expected;
    }


    @Override
    public Boolean Calculate() {
        int[] result = new int[this.numbers.length];
        for (int i = 0; i < this.numbers.length; i++) {
            int total = 1;
            for (int j = 0; j < this.numbers.length; j++) {
                if (j != i) {
                    total = total * this.numbers[j];
                }
            }
            result[i] = total;
        }
        return true;
    }
}
