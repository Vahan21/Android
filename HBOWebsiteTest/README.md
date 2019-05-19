# My example qa project

The project implements parallel automation testing on '/www.hbo.com' website.

## Prerequisites

 * Download Сhromedriver in usr/bin/ 
  
 * Download Firefoxdriver in usr/bin/
  
 * Install chrome 
  
 * Install firefox 

 * Install java 

 * Install maven

 * Install node
 
 * Install selenium-server-standalone-3.13.0.jar (or another version)


 * Navigate to the location of selenium-server-standalone-3.13.0.jar and run the following commands:
```bash
    $ java -jar selenium-server-standalone-3.13.0.jar -role hub -browserTimeout 60 -cleanUpCycle 3 -sessionTimeout 30 -maxSession 10

    $ java -jar selenium-server-standalone-3.13.0.jar -role node -hub http://localhost:4444/grid/register -browserTimeout 60 -cleanUpCycle 3 -sessionTimeout 30 -maxSession 10


```

## Usage

```
//run all tests according to xml file
$ mvn test -Dbrowsers=chrome,firefox -DthreadCount=3

//Run a group (smoke) or class or a single method
$ mvn test -Dbrowsers=chrome,firefox -Dgroups=MainPageTest -DthreadCount=3

$ mvn test -Dbrowsers=chrome,firefox -Dgroups=verifyMainPageHeader -DthreadCount=3

//Run a single case on a single browser
$ mvn test -Dtest=MainPageTest#verifyTitle -Dos=linux -Dbrowser=chrome -DthreadCount=1 -DbrowserVersion=69.0.3497.100

```