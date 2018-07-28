<?php
/**
 * Created by PhpStorm.
 * User: Animc
 * Date: 28-07-2018
 * Time: 12:58
 */


class ExperimentResults
{


    public $name;
    public $list;
    public $avg;
    public $med;
    public $high;
    public $low;

    function __construct($n, $li, $a, $m, $h, $l)
    {
        $this->name = $n;
        $this->list = $li;
        $this->avg = $a;
        $this->med = $m;
        $this->high = $h;
        $this->low = $l;
    }

    public static function PrintMe(ExperimentResults $res){
        print $res->name." results: \n";
        print "Median: ".round($res->med)."ns\n";
        print "Average: ".round($res->avg)."ns\n";
        print "High: ".round($res->high)."ns\n";
        print "Low: ".round($res->low)."ns\n";
        print "\n======================\n\n";
    }

    public static function GetName(ExperimentResults $res){
        return $res->name;
    }
    public static function GetList(ExperimentResults $res){
        return $res->list;
    }
    public static function GetAvg(ExperimentResults $res){
        return $res->avg;
    }
    public static function GetMed(ExperimentResults $res){
        return $res->med;
    }
    public static function GetHigh(ExperimentResults $res){
        return $res->high;
    }
    public static function GetLow(ExperimentResults $res){
        return $res->low;
    }

}