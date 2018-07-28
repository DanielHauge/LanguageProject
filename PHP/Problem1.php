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

    }
}