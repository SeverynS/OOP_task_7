package com.models;

public class MoldovianHen extends Hen{
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    public String getDescription(){
        return (super.getDescription() + "Моя страна - Молдова. Я несу " + this.getCountOfEggsPerMonth()
                + " яиц в месяц");
    }
}
