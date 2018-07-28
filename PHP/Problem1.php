<?php
/**
 * Created by PhpStorm.
 * User: Animc
 * Date: 28-07-2018
 * Time: 12:57
 */




class Problem1 implements Problem
{


    public $list;
    public $k;
    public $exp;

    function __construct($list, $k, $exp)
    {
        $this->list = $list;
        $this->k = $k;
        $this->exp = $exp;
    }

    public function Calculate()
    {
        $res = false;
        $set = array();
        foreach ($this->list as $value){
            if (isset($set[$value])){
                $res = true;
                return $res == $this->exp;
            }else{
                $complement = $this->k-$value;
                $set[$complement] = true;
            }
        }

        return $this->k==$res;

    }
}