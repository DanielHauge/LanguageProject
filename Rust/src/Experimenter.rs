
pub use problem::problem::ProblemTrait;
pub use ExperimentResults::results::experimentResults;

pub mod experimenter{
    extern crate time;

    use experimenter::experimentResults;

    pub fn run_experiment<Trait: super::ProblemTrait>(problem: Trait) -> Box<experimentResults> {
        println!("Running experiments");
        let mut measurements = vec![];
        for _ in 0..100{
            let now = time::precise_time_ns();
            let validity = problem.calculate();
            let dur = time::precise_time_ns()-now;

            measurements.push(dur);
            if !validity{
                println!("Algorithm failed!")
            }
        }

        return Box::from(experimentResults { average: average(measurements.as_mut_slice()), median: median(measurements.as_mut_slice()), high: high(measurements.as_mut_slice()), low: low(measurements.as_mut_slice()) });
        //printall(measurements.as_mut_slice());
    }

    fn average(nums: &mut [u64]) -> f32{
        let mut total : u64 = 0;
        for x in nums.iter(){
            total = total + x
        }
        let avg = total as f32 / nums.len() as f32;
        return avg;
    }

    fn median(numbs: &mut [u64]) -> u64{
        numbs.sort();
        let mid = numbs.len()/2;
        return numbs[mid];

    }

    fn high(numbs: &mut [u64]) -> u64 {
        numbs.sort();
        let high = numbs.len()-1;
        return numbs[high];
    }

    fn low (numbs: &mut [u64]) -> u64 {
        numbs.sort();
        let low = 0;
        return numbs[low];
    }

    fn printall(numbs: &mut [u64]){
        for x in numbs.iter(){
            println!("{}", x)
        }
    }

    pub fn print_indi(results: &[Box<experimentResults>]){
        for x in results.iter(){
            x.PrintMe();
        }
    }

    pub fn print_avg(results: &[Box<experimentResults>]){

        println!("Printing Averages:");
        println!("Average-Average: {}ns", avg_avg(results));
        println!("Average-Median: {}ns", avg_med(results));
        println!("Average-High: {}ns", avg_high(results));
        println!("Average-Low: {}ns", avg_low(results));

    }

    fn avg_avg(results: &[Box<experimentResults>]) -> f32{

        let mut total : u64 = 0;
        for x in results{
            total = total + x.average as u64
        }
        let avg = total as f32 / results.len() as f32;
        return avg;
    }

    fn avg_med(results: &[Box<experimentResults>]) -> f32{

        let mut total : u64 = 0;
        for x in results{
            total = total + x.median
        }
        let avg = total as f32 / results.len() as f32;
        return avg;
    }

    fn avg_high(results: &[Box<experimentResults>]) -> f32{

        let mut total : u64 = 0;
        for x in results{
            total = total + x.high
        }
        let avg = total as f32 / results.len() as f32;
        return avg;
    }

    fn avg_low(results: &[Box<experimentResults>]) -> f32{

        let mut total : u64 = 0;
        for x in results{
            total = total + x.low
        }
        let avg = total as f32 / results.len() as f32;
        return avg;
    }



}
