package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.flavour", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
