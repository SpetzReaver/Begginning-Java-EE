/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeforge.bookservice01;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Katleho
 */
public class LoggingProducer {
    @Produces
    public Logger produceLogger(InvocationContext ic){
        return Logger.getLogger(ic.getTarget().getClass().getName());
    }
}
