using System;
using System.Collections.Generic;
using System.Text;

namespace Problems
{
    class Problem1 : Problem
    {

        int[] list;
        int k;
        bool exp;

        public Problem1(int[] list, int k, bool exp)
        {
            this.list = list;
            this.k = k;
            this.exp = exp;
        }

        public bool Calculate()
        {
            bool res = false;
            HashSet<int> hashSet = new HashSet<int>();
            foreach (int i in list)
            {
                if (hashSet.Contains(i))
                {
                    res = true;
                }
                else
                {
                    hashSet.Add(k - i);
                }
            }


            return res;
        }


    }
}
