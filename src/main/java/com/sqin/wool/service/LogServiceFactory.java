package com.sqin.wool.service;

/*
 * @Author Sheng Qin
 * @Description
 * @Date 15:14 2020/12/5
 **/
public class LogServiceFactory {

    private static LogService logService;

    private LogServiceFactory() {
    }

    public static LogService getLog() {
        if (logService == null) {
            logService = new LogServiceImpl();
        }
        return logService;
    }
}
