package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar instance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int num) {
//         add number of days to instance that you pass in
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}
