package com.sqin.wool.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/*
 * @Author Sheng Qin
 * @Description
 * @Date 15:14 2020/12/5
 **/
@Service
public class LogServiceImpl implements LogService {

    @Override
    public void error(Class<?> aClass, String msg, Exception ex) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.error(msg, ex);
    }

    @Override
    public void error(Class<?> aClass, String msg, Object... params) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.error(msg, params);
    }

    @Override
    public void warn(Class<?> aClass, String msg, Object... params) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.warn(msg);
    }

    @Override
    public void info(Class<?> aClass, String msg, Object... params) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.info(msg, params); // inside slf4j does the isInfoEnabled condition
    }

    @Override
    public void debug(Class<?> aClass, String msg, Object... params) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.debug(msg, params); // inside slf4j does the isDebugEnabled condition
    }

    @Override
    public void trace(Class<?> aClass, String msg) {
        Logger log = LoggerFactory.getLogger(aClass);
        log.trace(msg);  // inside slf4j does the isTraceEnabled condition
    }

    @Override
    public boolean isInfoEnabled(Class<?> aClass) {
        Logger log = LoggerFactory.getLogger(aClass);
        return log.isInfoEnabled();
    }

    @Override
    public boolean isDebugEnabled(Class<?> aClass) {
        Logger log = LoggerFactory.getLogger(aClass);
        return log.isDebugEnabled();
    }

    @Override
    public boolean isTraceEnabled(Class<?> aClass) {
        Logger log = LoggerFactory.getLogger(aClass);
        return log.isTraceEnabled();
    }
}
