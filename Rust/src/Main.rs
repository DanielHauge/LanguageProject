mod Experimenter;
mod Problem1;
mod Problem;

use Problem1::Problem1::Problem1Struct;
use Experimenter::Experimenter::RunExperiment;

fn main() {
    RunExperiment();
    let p = Problem1Struct{list: 16,k: 32,exp: false};
    let result = p.Calculate();




}