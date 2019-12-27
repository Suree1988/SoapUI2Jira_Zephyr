javac -cp ./lib/*  src/com/zephyr/TestRunner.java
java -cp ./bin;./lib/* org.junit.runner.JUnitCore com.zephyr.TestRunner
