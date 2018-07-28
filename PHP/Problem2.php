<?php
/**
 * Created by PhpStorm.
 * User: Animc
 * Date: 29-07-2018
 * Time: 00:11
 */

class Problem2 implements Problem
{

    public $list;
    public $exp;

    function __construct($list, $exp)
    {
        $this->list = $list;
        $this->exp = $exp;
    }

    public function Calculate()
    {
        $array = array();
        $l = count($this->list);
        for ($x = 0; $x < $l; $x++){
            $total = 1;
            for ($j = 0; $j < count($this->list); $j++){
                if ($j != $x){
                    $total = $total * $this->list[$j];
                }
            }
            array_push($array, $total);
        }
        return true;
    }
}