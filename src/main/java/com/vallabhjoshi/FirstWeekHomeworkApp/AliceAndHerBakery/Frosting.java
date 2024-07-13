package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public interface Frosting {
    public void getFrostingType();
}
