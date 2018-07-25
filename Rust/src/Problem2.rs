pub use problem::problem::ProblemTrait;

pub mod problem2{

    pub struct Problem2Struct {
        pub list: Vec<i32>,
        pub exp: Vec<i32>
    }

    impl super::ProblemTrait for Problem2Struct {

        fn calculate(&self) -> bool {
            let mut slize: [i32; 10] = [0; 10];

            for i in 0..self.list.len() {
                let mut total = 1;
                for j in 0..self.list.len(){
                    if j != i {
                        total = total * self.list[j]

                    }
                }

                slize[i] = total;

            }

            return true;
        }


    }





}