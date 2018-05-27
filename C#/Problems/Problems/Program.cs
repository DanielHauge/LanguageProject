using System;

namespace Problems
{
    class Program
    {
        static void Main(string[] args)
        {
            Problems p = new Problems();
            int[] list = new int[] { 10, 15, 3, 7 };
            Console.WriteLine(p.CanListSumToK(list, 13));
            Console.ReadLine();

        }
    }
}
