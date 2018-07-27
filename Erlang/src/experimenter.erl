%%%-------------------------------------------------------------------
%%% @author Animc
%%% @copyright (C) 2018, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 27. jul 2018 17:08
%%%-------------------------------------------------------------------
-module(experimenter).
-author("Animc").

%% API
-export([runExperiment/1]).

runExperiment(Problem) ->
  io:fwrite("on experiment: ~s", Problem).

