package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CakeBaker {

    @Autowired
    public Frosting frosting;

    @Autowired
    public Syrup syrup;

    public void cakeBake(){
        frosting.getFrostingType();
        syrup.getSyrupType();
    }

}
