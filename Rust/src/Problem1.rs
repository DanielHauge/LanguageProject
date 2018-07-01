pub use problem::problem::ProblemTrait;

pub mod problem1 {

    pub struct Problem1Struct {
        pub list: Vec<i32>,
        pub k: i32,
        pub exp: bool
    }

    use std::collections::HashSet;

    impl super::ProblemTrait for Problem1Struct {
        fn calculate(&self) -> bool{
            let mut res = false;
            let mut set = HashSet::new();
            for x in self.list.iter(){
                if set.contains(x){
                    res = true;
                    return self.exp==res;
                } else {
                    set.insert(self.k-x);
                }

            }
            return self.exp==res;
        }
    }

}

