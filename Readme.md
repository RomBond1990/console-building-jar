# Bulding .jar from terminal
###### * for windows terminal
##### 1. To compile `*.java` into `*.class` use (from root folder)
```
javac -d classes src/com/rbondarovich/*.java
```
The compiled files will be located in the classes folder

##### 2. To run a compiled file (where HelloWorld is the file name)
```
java -cp classes com.rbondarovich.HelloWorld
```
##### 3. To building jar
```
$cd classes
$jar cfe programmName.jar com.rbondarovich.HelloWorld com/rbondarovich/*.class
```
where

- The c option indicates that you want to create a JAR file.
- The f option indicates that you want the output to go to a file rather than to stdout.
- By using the e option, we can specify our entry point, and the jar command will add it to the generated manifest file.
- The programmName.jar is jar name
- The com.rbondarovich.HelloWorld is app entry point
##### 4. To run app
```
java -jar  programmName.jar
```

# With libs
##### 1. To compile `*.java` into `*.class` use (from root folder)
```
$javac -cp src/com/rbondarovich src/com/rbondarovich/*.java -d out/ -classpath libs/commons-validator-1.6.jar
$copy libs\commons-validator-1.6.jar out\commons-validator-1.6.jar
$cd out
$tar xf commons-validator-1.6.jar
$del commons-validator-1.6.jar
$jar cvfm  programmName.jar ..\resources\META-INF\MANIFEST.MF .
```
##### 2. To run app
```
java -jar  programmName.jar
```