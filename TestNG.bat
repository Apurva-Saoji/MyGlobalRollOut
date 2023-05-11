cd..
cd..
D:
set projectpath=D:\Testing Team Automation\MyGlobalRollOut
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java  org.testng.TestNG TestNG.xml
pause