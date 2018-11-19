package com.jh.yarnminihadoop;

import org.apache.hadoop.yarn.client.api.YarnClient;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        YarnClient yarnClient = YarnClient.createYarnClient();
        yarnClient.init(conf);
        yarnClient.start();
    }
}
