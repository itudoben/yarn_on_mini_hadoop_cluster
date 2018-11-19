package com.jh.yarnminihadoop;

//import org.apache.hadoop.yarn.client.api.YarnClient;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;


/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
//        YarnClient yarnClient = YarnClient.createYarnClient();
//        yarnClient.init(conf);
//        yarnClient.start();


        String logFile = "/Users/hujol/Projects/distributed_computing/yarn_on_mini_hadoop_cluster/README.md"; // Should be some file on your system
        SparkSession spark = SparkSession.builder().appName("Simple Application").getOrCreate();
        Dataset<String> logData = spark.read().textFile(logFile).cache();

        FilterFunction<String> filterFunction = s -> s.contains("a");
        long numAs = logData.filter(filterFunction).count();
        FilterFunction<String> fff = s -> s.contains("b");
        long numBs = logData.filter(fff).count();

        System.out.println("*** ===> Lines with a: " + numAs + ", lines with b: " + numBs);

        spark.stop();
    }
}
