using System;
using System.Collections.Generic;
using System.Text;

namespace Problems
{
    class Problem3 : Problem
    {
        private int[] numbers;
        private int exp;

        public Problem3(int[] numbers, int expected)
        {
            this.numbers = numbers;
            this.exp = expected;
        }

        public bool Calculate()
        {
            int counter = 0;
            HashSet<int> set = new HashSet<int>();
            foreach (int num in numbers)
            {
                if (num == counter + 1)
                {
                    counter++;
                    while (set.Contains(counter + 1))
                    {
                        counter++;
                    }
                }
                else
                {
                    set.Add(num);
                }
            }

            return counter+1 == this.exp;
        }

        
    }
}
