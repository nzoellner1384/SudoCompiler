@echo off
setlocal ENABLEDELAYEDEXPANSION
set file=%1
set type=.java
set blank=""
java -jar SudoCompiler.jar %file%
call set file=%file:.n=!type!%
javac %file%
@echo Finished!