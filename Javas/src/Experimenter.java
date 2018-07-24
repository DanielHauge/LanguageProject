import java.util.ArrayList;
import java.util.Arrays;

public class Experimenter {



    public ExperimentResults RunExperiment(Problem p){
        System.out.println("Running experiment on: "+p.getClass().getName());
        ArrayList<Long> meassurements = new ArrayList<>();
        Boolean res;
        long end;
        long begin;
        for (int i = 0; i < 100000; i++) {
            begin = System.nanoTime();
            res = p.Calculate();
            end = System.nanoTime();
            meassurements.add(end-begin);
            if (!res){
                System.out.println("Uhh the Algorithm failed");
            }
        }

        Long[] results = meassurements.toArray(new Long[0]);
        return new ExperimentResults(p.getClass().getName(), results, Average(results), Median(results), High(results), Low(results));

    }


    private static long Median(Long[] durations){
        Arrays.sort(durations);
        return durations[durations.length/2];
    }

    private static long Average(Long[] durations){
        Long total = 0l;
        for (Long duration : durations) {
            total+=duration;
        }
        return total/durations.length;
    }

    private static long High(Long[] durations){
        Arrays.sort(durations);
        return durations[durations.length-1];
    }

    private static long Low(Long[] durations){
        Arrays.sort(durations);
        return durations[0];
    }





}
