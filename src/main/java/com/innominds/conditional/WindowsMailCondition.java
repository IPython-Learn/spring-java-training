package com.innominds.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsMailCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // final String[] profiles = context.getEnvironment().getActiveProfiles();
        //
        // System.err.println("=======================================");
        // System.err.println("Active Profiles count" + profiles.length);
        //
        // for (final String profile : profiles) {
        // System.err.println(profile);
        // }
        // System.out.println(context.getEnvironment());
        //
        // System.err.println("=======================================" + context.getEnvironment().getProperty("os.name"));
        //
        return context.getEnvironment().getProperty("os.name").contains("Window");

        // return false;
    }
}
