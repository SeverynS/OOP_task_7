package com.models;

public class UkrainianHen extends Hen{
    public int getCountOfEggsPerMonth() {
        return 35;
    }

    public String getDescription(){
        return (super.getDescription() + "Моя страна - Украина. Я несу " + this.getCountOfEggsPerMonth()
                + " яиц в месяц");
    }
}
