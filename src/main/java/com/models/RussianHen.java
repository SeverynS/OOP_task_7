package com.models;

public class RussianHen extends Hen{
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    public String getDescription(){
        return (super.getDescription() + "Моя страна - Россия. Я несу " + this.getCountOfEggsPerMonth()
                + " яиц в месяц");
    }
}
