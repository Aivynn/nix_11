#!/bin/sh
# shellcheck disable=SC2164

. ./setantenv.bat

cd ./app

ant destroy build jar run
