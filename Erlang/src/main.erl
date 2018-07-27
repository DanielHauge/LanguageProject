
-module(main).

-export([run/0]).

-import(experimenter, [runExperiment/1]).


run() ->
  runExperiment("Hello").