import java.util.ArrayList;

public class main {

    public static void main (String[] args){
        Problems p = new Problems();

        long begin;
        long end;
        boolean result;
        ArrayList<Long> m;


        // p1
        System.out.println("Beginning Benchmark on Problem 1");
        System.out.print("Case 1 - N:5 = ");
        int[] list1 = new int[]{10, 15, 3, 7};
        begin = System.nanoTime();
        result = p.CanListSumToK(list1, 17);
        end = System.nanoTime()-begin;
        System.out.println(end+"ns"+ " and was: "+result);

        System.out.print("Case 2 - N:10 = ");
        int[] list2 = new int[]{38,16,94,40,79,78,74,75,61,73,23,13,1,52,89,27,48,86,73,100};
        begin = System.nanoTime();
        result = p.CanListSumToK(list2, 50);
        end = System.nanoTime()-begin;
        System.out.println(end+"ns"+ " and was: "+result);

        System.out.print("Case 3 - N:20 = ");
        int[] list3 = new int[]{5,2,28,22,17,4,32,100,97,53,37,59,78,88,55,45,95,25,67,72,69,40,34,33,51,8,56,80,21,35,54,64,90,39,47,25,7,84,89,89,22,18,23,35,87,73,74,33,92,22};
        begin = System.nanoTime();
        result = p.CanListSumToK(list3, 150);
        end = System.nanoTime()-begin;
        System.out.println(end+"ns"+ " and was: "+result);

        System.out.print("Case 4 - N:250 = ");
        int[] list4 = new int[]{371,231,632,676,880,179,895,699,322,344,120,953,81,500,535,846,757,963,192,845,330,393,736,389,490,776,400,733,882,454,8,99,403,7,865,622,84,759,675,51,394,946,215,764,492,561,971,869,735,771,160,841,738,497,63,883,379,880,317,621,809,998,231,142,751,756,808,74,630,44,32,760,736,583,579,554,214,985,27,255,974,246,403,148,492,976,855,799,948,108,38,454,950,257,762,134,291,523,758,343,766,815,317,330,778,116,811,130,259,227,92,848,781,498,527,960,319,811,24,789,998,551,591,822,270,27,51,817,392,310,493,947,788,912,525,917,364,390,925,201,241,188,675,215,302,109,249,240,154,675,282,498,693,1000,556,890,760,53,634,536,484,406,353,340,394,987,764,276,869,937,678,265,957,133,107,185,740,806,230,39,651,364,927,671,937,825,248,452,990,499,411,628,736,281,675,398,475,9,330,631,892,302,344,426,403,971,628,590,215,448,704,669,207,473,671,572,960,876,107,65,544,983,985,75,767,796,217,578,977,474,745,401,899,796,466,789,799,233,676,866,839,354,822,188,835,227,305,691,516,842};
        begin = System.nanoTime();
        result = p.CanListSumToK(list4, 500);
        end = System.nanoTime()-begin;
        System.out.println(end+"ns"+ " and was: "+result);


    }

}
