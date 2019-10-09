# InRhythm
Test project for analysis of sentences. It outputs number of symbols of longest word (or longest words if sentence contains 
several words with same MAX number of chars). User can change input sentences by changing of "text" string variable in 
jUnit tests, located in ./src/test/java/com/inrhythm/TextAnalyserTest.java file.

## Requirements
Running the InRhythm project requires Java 11.

Building the InRhythm project requires the following tools:

* JDK 11 (Oracle's JDK or OpenJDK recommended)
* Apache Maven 3.1.1+ (3.2+ recommended)
* JUnit 4x
* Surefire plugin (should come with Maven)
* Git
* IntellijIDEA (community edition is enough for simple and convenient project build and run, 
comes with all necessary built-in plugins and frameworks  - Maven, Surefire, Unit tests framework - 
JUnit, version control, etc.)

## Deploy and test run
1. Get the source code:
```
git clone https://github.com/vlipin/InRhythm.git
```
than open project /inrhythm folder in IntellijIDEA

2. Build project and run all tests using Maven:
```
mvn clean install
```
will output test results in maven logs

3. Possible to run individual tests in IntelliJIDEA: select test name in TextAnalyserTest.java 
(e.g. testTextWithPunctuation) and click Ctrl+Shift+R

## QA Results Output

After individual test or all tests run, output contains:

 - Analyzing: "sentence" - let user know what sentence is analyzing  
 - Count: N - number of chars in longest word(s)
 - Words: [word1, word2] - set of longest words: can be empty (if file is empty), contains 1 or more words 
with same MAX length

