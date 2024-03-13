package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class LoggerUtil {
    public static void log(Object o, String methodName){
        Class klass = o.getClass();

        for (Method m : klass.getMethods()) {
            if (m.getName().equals(methodName)){
                for (Annotation a : m.getAnnotations()){
                    if(a instanceof LogMethodCall){
                        LogMethodCall lmc = (LogMethodCall) a;
                        switch (lmc.logLevel()){
                            case Logger.INFO:
                                System.out.println("performing info log for \"" + m.getName() + " method");
                                break;
                            case Logger.DEBUG:
                                System.out.println("performing debug log for \"" + m.getName() + " method");
                                break;
                        }
                    }
                }
                break;
            }
        }
    }
}
