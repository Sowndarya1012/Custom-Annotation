package com.college.injector;

import com.college.annotations.Inject;
import java.lang.reflect.Field;

public class DependencyInjector {
    public static void injectDependencies(Object obj) throws Exception {
        Class<?> c = obj.getClass();
        for (Field f : c.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                Object dependency = f.getType().getDeclaredConstructor().newInstance();
                f.set(obj, dependency);
            }
        }
    }
}
