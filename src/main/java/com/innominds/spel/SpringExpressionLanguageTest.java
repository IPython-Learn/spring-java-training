package com.innominds.spel;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpringExpressionLanguageTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(TimeConfig.class);

        ctx.refresh();

        final TimeService timeService = ctx.getBean(TimeService.class);

        System.out.println(timeService.getServerTime());

        System.out.println(timeService.getUserTimeZone());

        ctx.close();

        // ////////////SPRING EXPRESSION PARSER /////////////////////////

        final ExpressionParser parser = new SpelExpressionParser();
        final Map<?, ?> inventorInfo = (Map<?, ?>) parser.parseExpression("{name:'Nikola',dob:'10-July-1856'}").getValue(new StandardEvaluationContext());

        System.out.println(inventorInfo.get("name"));

    }
}
