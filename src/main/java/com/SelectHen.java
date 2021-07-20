package com;

import com.models.*;

public class SelectHen {
    public Hen SelectHenType(HenType type){
        Hen hen = null;

        switch (type) {
            case UKRAINE:
                hen = new UkrainianHen();
                break;
            case RUSSIA:
                hen = new RussianHen();
                break;
            case MOLDOVIA:
                hen = new MoldovianHen();
                break;
            case BELARUSSIA:
                hen = new BelarusianHen();
                break;
        }
        System.out.println(hen.getCountOfEggsPerMonth() +"\n"+ hen.getDescription());

        return hen;
    }
}
