/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeforge.bookservice01;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Katleho
 */
@Interceptor
@Loggable
public class LoggingInterceptor {
    @Inject
    Logger log;
    
    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception{
        log.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        try{
                return ic.proceed();
        }finally{
        log.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        }
    }
}
