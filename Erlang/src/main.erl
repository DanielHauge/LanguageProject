%%%-------------------------------------------------------------------
%%% @author Animc
%%% @copyright (C) 2018, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 23. jul 2018 11:27
%%%-------------------------------------------------------------------
-module('main').

%% IMPORT

%% API
-export([sayhello/1]).


sayhello(gretting) -> io:fwrite("hello, world ~s\n", [gretting]).
