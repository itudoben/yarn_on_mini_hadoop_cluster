# Introduction
This project allows to run a Java YARN application on a macOS pc hosting a mini hadoop cluster.

# Running the app in Spark

Based on http://spark.apache.org/docs/latest/quick-start.html

```bash
mvn package

spark-submit --class "com.jh.yarnminihadoop.App"   --master local[4]   target/yarnmain-0.1.0.jar
```
