<?php
require 'Experimenter.php';
require 'ExperimentResults.php';
require 'Problem1.php';

$exp = new Experimenter();

$R1 = $exp->RunExperiment(new Problem1());
$R2 = $exp->RunExperiment(new Problem1());

$combiend = [$R1, $R2];

$exp->PrintIndi($combiend);
$exp->PrintAverages($combiend);



?>