package com.example.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: logback->HelloWorld1
 * @description:
 * @author: hunyiha
 * @create: 2020-10-01 18:20
 **/
public class HelloWorld {

    //定义日志对象
    private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            //级别为debug的日志
            logger.debug(String.valueOf(i));
            //级别为info的日志
            logger.info(String.valueOf(i));
            //级别为warn的日志
            logger.warn(String.valueOf(i));
            //级别为error的日志
            logger.error(String.valueOf(i));
        }
    }
}
