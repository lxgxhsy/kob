package com.kob.botrunningsystem.controller;

import java.lang.reflect.Method;

public class est {
    public static void main(String[] args) throws Exception{
        Class<?> a = Class.forName("com.kob.botrunningsystem.service.impl.BotRunningServiceImpl").getClass();
        Class<?> b = Class.forName("com.kob.botrunningsystem.controller.BotRunningController").getClass();

        System.out.println("aaa");
    }
}
