package me.guiijo.spring_api_dio.domain.model;

public class Card {

    public String number;
    public float limit;

    public Card(String number, float limit) {
        this.number = number;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public float getLimit() {
        return limit;
    }

}
