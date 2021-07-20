package com.models;

public class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth() {
        return 55;
    }

    public String getDescription(){
        return (super.getDescription() + "Моя страна - Беларусь. Я несу " + this.getCountOfEggsPerMonth()
                + " яиц в месяц");
    }
}
