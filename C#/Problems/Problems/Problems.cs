using System;
using System.Collections.Generic;
using System.Text;

namespace Problems
{
    class Problems
    {

        // Problem 1
        public bool CanListSumToK(int[] list, int k)
        {
            HashSet<int> hashSet = new HashSet<int>();
            foreach (int i in list)
            {
                if (hashSet.Contains(i))
                {
                    return true;
                }
                else
                {
                    hashSet.Add(k-i);
                }
            }


            return false;
        }

    }
}
