package me.guiijo.spring_api_dio.domain.model;

public class Account {

    private String accountNumber;
    private String accountAgency;
    private float accountBalance;
    private float accountLimit;
    
    public Account(String accountNumber, String accountAgency, float accountBalance, float accountLimit) {
        this.accountNumber = accountNumber;
        this.accountAgency = accountAgency;
        this.accountBalance = accountBalance;
        this.accountLimit = accountLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountAgency() {
        return accountAgency;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public float getAccountLimit() {
        return accountLimit;
    }
    
}
