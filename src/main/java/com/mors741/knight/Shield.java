package com.mors741.knight;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ShieldCondition.class)
public class Shield {
    @Override public String toString() {
        return "Shield{}";
    }
}
