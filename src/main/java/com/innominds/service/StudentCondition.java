package com.innominds.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class StudentCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        final String[] profiles = context.getEnvironment().getActiveProfiles();

        System.err.println("=======================================");
        System.err.println("Active Profiles count" + profiles.length);

        for (final String profile : profiles) {
            System.err.println(profile);
        }

        System.err.println("=======================================");

        return true;
    }
}
