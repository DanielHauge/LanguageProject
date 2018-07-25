

pub mod results{

    pub struct experimentResults{
        pub average: f32,
        pub median: u64,
        pub high: u64,
        pub low: u64
    }

    impl experimentResults {

        pub fn PrintMe(&self){
            println!("");
            println!("Median: {}ns", self.median);
            println!("Average: {}ns", self.average);
            println!("High: {}ns", self.high);
            println!("Low: {}ns", self.low);
            println!("===========================")
        }



    }


}