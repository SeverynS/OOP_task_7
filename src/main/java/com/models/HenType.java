package com.models;

public enum HenType {

    UKRAINE("Украина"),
    RUSSIA("Россия"),
    MOLDOVIA("Молдавия"),
    BELARUSSIA("Беларусь");

    String alias;

    HenType(String alias) {
        this.alias = alias;
    }

    public static HenType getTypeByAlias(String type){

        for(HenType henType : values()){
            if(henType.alias.equals(type)){
                return henType;
            }
        }

        return null;
    }
}
