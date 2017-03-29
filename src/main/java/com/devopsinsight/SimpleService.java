package com.devopsinsight;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author Marcel Friedmann
 */
@Stateless
public class SimpleService {

	
    @Asynchronous
    public Future<String> testableMethod(String name) {
        if (name != null) {
            return new AsyncResult<String>("Hello " + name);
        } else {
            return new AsyncResult<String>("Hello World!");
        }
    }

   
    
}
