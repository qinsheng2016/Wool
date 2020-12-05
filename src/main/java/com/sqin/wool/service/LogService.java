package com.sqin.wool.service;

/*
 * @Author Sheng Qin
 * @Description
 * @Date 15:14 2020/12/5
 **/
public interface LogService {

    void error(Class<?> aClass, String msg, Exception ex);

    void error(Class<?> aClass, String msg, Object... params);

    void warn(Class<?> aClass, String msg, Object... params);

    void info(Class<?> aClass, String msg, Object... params);

    void debug(Class<?> aClass, String msg, Object... params);

    void trace(Class<?> aClass, String msg);

    boolean isInfoEnabled(Class<?> aClass);

    boolean isDebugEnabled(Class<?> aClass);

    boolean isTraceEnabled(Class<?> aClass);
}
