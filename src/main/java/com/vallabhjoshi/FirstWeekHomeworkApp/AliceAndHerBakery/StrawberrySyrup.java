package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.flavour", havingValue = "strawberry")
public class StrawberrySyrup implements  Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Strawberry Syrup");
    }
}
