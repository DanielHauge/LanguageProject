import java.util.HashSet;

public class Problems {


    // Problem 1
    public boolean CanListSumToK(int[] list, int k){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : list) {
            if (set.contains(i)){
                return true;
            } else{
                set.add(k-i);
            }
        }
        return false;
    }


}
