package me.guiijo.spring_api_dio.domain.model;

public class Card {

    private Long id;
    private String number;
    private Double limit;

    public String getNumber() {
        return number;
    }

    public Double getLimit() {
        return limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

}
