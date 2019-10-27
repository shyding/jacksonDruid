@echo off
setlocal
cd /D %0\..\..
call mvn mybatis^-generator:generate
pause
