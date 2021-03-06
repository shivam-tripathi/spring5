package com.bsg5.chapter5;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@WebListener
public class AnnotationContextListener implements ServletContextListener {
    private ApplicationContext buildAnnotationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan("com.bsg5.chapter3.mem03");
        context.refresh();
        return context;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext context = buildAnnotationContext();
        sce.getServletContext().setAttribute("context", context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
