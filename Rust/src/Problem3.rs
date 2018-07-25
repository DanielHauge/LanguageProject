pub use problem::problem::ProblemTrait;


pub mod problem3 {

    pub struct Problem3Struct {

        pub list: Vec<i32>,
        pub k: i32
    }

    use std::collections::HashSet;
    use std::borrow::Borrow;

    impl super::ProblemTrait for Problem3Struct {
        fn calculate(&self) -> bool {
            let mut set = HashSet::new();
            let mut counter: i32 = 0;
            for x in self.list.iter(){
                if *x == counter+1{
                    counter +=1;
                    while set.contains((counter + 1).borrow()) {
                        counter+=1;
                    }
                }else {
                    set.insert(x);
                }
            }
            return counter+1 == self.k;
        }


    }


}