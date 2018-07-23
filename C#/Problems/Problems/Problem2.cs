using System;
using System.Collections.Generic;
using System.Text;

namespace Problems
{
    class Problem2 : Problem
    {

        private int[] numbers;
        private int[] expected;

        public Problem2(int[] numbers, int[] expected)
        {
            this.numbers = numbers;
            this.expected = expected;
        }

        public bool Calculate()
        {
            int[] result = new int[this.numbers.Length];
            for (int i = 0; i<this.numbers.Length; i++)
            {
                int total = 1;
                for (int j = 0; j<this.numbers.Length; j++)
                {
                    if (j != i)
                    {
                        total = total*this.numbers[j];
                    }
                }
                result[i] = total;
            }

            //Printall(result);
            //Console.WriteLine();

            return true;

        }

        private bool CheckArrayEquality(int[] a, int[] b)
        {
            return true;
        }

        private void Printall(int[] numbers)
        {
            foreach (var num in numbers)
            {
                Console.Write(num+" - ");
            }
        }

    }
}
