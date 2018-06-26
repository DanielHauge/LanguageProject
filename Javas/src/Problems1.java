import java.util.HashSet;

public class Problems1 implements Problem{


    int[] list;
    int k;
    boolean exp;


    public Problems1(int[] list, int k, boolean exp){
        this.list = list;
        this.k = k;
        this.exp = exp;
    }

    @Override
    public Boolean Calculate() {
        boolean res = false;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : list) {
            if (set.contains(i)){
                res = true;
            } else{
                set.add(k-i);
            }
        }
        return res;
    }
}
