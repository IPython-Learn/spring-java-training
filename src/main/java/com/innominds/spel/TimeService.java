package com.innominds.spel;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;

public class TimeService {

    {
        System.currentTimeMillis();// this can be invoked from SpEL
    }

    @Value("#{ systemProperties['user.timezone'] }")
    private String timeZone;

    @Value("#{T(java.lang.System).currentTimeMillis()}")
    private long serverTimeInMilles;

    public String getServerTime() {

        return new Date(serverTimeInMilles).toString();
    }

    public String getUserTimeZone() {

        return timeZone;
    }

}
