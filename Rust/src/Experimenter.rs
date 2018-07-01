


pub use problem::problem::ProblemTrait;


pub mod experimenter{
    extern crate time;
    pub fn run_experiment<Trait: super::ProblemTrait>(problem: Trait){
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
        println!("Median was: {}ns", median(measurements.as_mut_slice()));
        println!("Average was: {}ns", average(measurements.as_mut_slice()));
        println!(" -----------------------");
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

    fn printall(numbs: &mut [u64]){
        for x in numbs.iter(){
            println!("{}", x)
        }
    }
}
