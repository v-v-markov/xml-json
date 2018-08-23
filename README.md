# XML/JSON Training practice (by vmarkov)


## Prerequisites
Before you start, be sure that you've installed:
-    Java 8+
-    Maven 3.5+

## Overview

Training description can be found in [this page](https://confluence.noveogroup.com/display/Trainings/XML+JSON+Training).
Results of the practice are described below.

### XML Schema

XML Schema is provided in tasks\XML_Schema\schema_task1_1.xsd. 
Could be tested online at https://www.freeformatter.com/xml-validator-xsd.html.


### XPath

XPath requests are provided in tasks\XPath\mobilePhones.xpath and tasks\XPath\peopleWitPassports.xpath. 
Could be tested online at https://www.freeformatter.com/xpath-tester.html

### XSLT

XPath requests are provided in tasks\XSLT\task1.xslt and tasks\XSLT\task2.xslt. 
Could be tested (on Windows) by running commands in tasks\XSLT directory: 
```
 ..\bin\msxsl.exe task1.xml task1.xslt
```
and
```
 ..\bin\msxsl.exe task2.xml task2.xslt > task2.html
```

### JSON libraries

## How to build the project

```
 mvn clean package -Ppack -DskipTests=true
```

## How to run and use the project

Could be launched by running command in target directory: 
```
 java -jar xmljson-jar-with-dependencies.jar --jackson-binding -f [path to JSON file]
```

E.g. (on Windows) by command: 
```
 java -jar xmljson-jar-with-dependencies.jar --jackson-binding -f ..\\tasks\\JSON\\input_1.json
```
