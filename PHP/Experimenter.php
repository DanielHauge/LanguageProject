<?php
/**
 * Created by PhpStorm.
 * User: Animc
 * Date: 28-07-2018
 * Time: 12:57
 */

require 'Problem.php';

class Experimenter
{

    public function RunExperiment(Problem $problem){

        $mes = [];
        for ($i = 0; $i < 1000000; $i++){
            $start = microtime(true);
            $res = $problem->Calculate();
            $time_elapsed = microtime(true) - $start;
            $nanos = $time_elapsed*1000000000;
            array_push($mes, $nanos);
            if (!$res){
                print "Algorithm failed==================================\nAlgorithm failed==================================\nAlgorithm failed==================================\nAlgorithm failed==================================\nAlgorithm failed==================================\n";
                break;
            }
        }
        return new ExperimentResults(get_class($problem), $mes, $this->Average($mes),$this->Median($mes),$this->High($mes),$this->Low($mes));
    }


    function Average($numbers){
        $total = 0;
        foreach ($numbers as $value){
            $total = $total + $value;
        }
        return $total/count($numbers);
    }

    function Median($numbers){
        sort($numbers);
        return $numbers[count($numbers)/2];

    }

    function High($numbers){
        sort($numbers);
        return $numbers[count($numbers)-1];
    }

    function Low($numbers){
        sort($numbers);
        return $numbers[0];
    }

    public function PrintIndi(array $results){
        foreach ($results as $result){
            ExperimentResults::PrintMe($result);
        }
    }

    public function PrintAverages(array $results){
        print "Printing Averages on: ".ExperimentResults::GetName($results[0])."\n";
        print "Average-Average: ".round($this->AvgOfAvg($results))."ns\n";
        print "Average-Median: ".round($this->AvgOfMed($results))."ns\n";
        print "Average-High: ".round($this->AvgOfHigh($results))."ns\n";
        print "Average-Low: ".round($this->AvgOfLow($results))."ns\n";
    }

    function AvgOfAvg(array $results){
        $total = 0;
        foreach ($results as $result){
            $total = $total+ExperimentResults::GetAvg($result);
        }
        return $total/count($results);
    }

    function AvgOfMed(array $results){
        $total = 0;
        foreach ($results as $result){
            $total = $total+ExperimentResults::GetMed($result);
        }
        return $total/count($results);
    }

    function AvgOfHigh(array $results){
        $total = 0;
        foreach ($results as $result){
            $total = $total+ExperimentResults::GetHigh($result);
        }
        return $total/count($results);
    }

    function AvgOfLow(array $results){
        $total = 0;
        foreach ($results as $result){
            $total = $total+ExperimentResults::GetLow($result);
        }
        return $total/count($results);
    }

}