<?php
/**
 * Created by PhpStorm.
 * User: Animc
 * Date: 29-07-2018
 * Time: 00:11
 */

class Problem3 implements Problem
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
        $counter = 0;
        $set = array();
        foreach ($this->list as $num){
            if ($num == $counter+1){
                $counter++;
                while (isset($set[$counter+1])){
                    $counter++;
                }
            } else {
                $set[$num] = true;
            }
        }

        return $counter+1 == $this->exp;

    }
}