package com.sqin.wool.entity;

import java.util.Objects;

public class CreditCard {
    private int id;
    private String cardNumber;
    private String bank;
    private String type;
    private int creditLimit;
    private String currency;

    public CreditCard() {
    }

    public CreditCard(int id, String cardNumber, String bank, String type, int creditLimit, String currency) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.bank = bank;
        this.type = type;
        this.creditLimit = creditLimit;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return id == that.id &&
                creditLimit == that.creditLimit &&
                cardNumber.equals(that.cardNumber) &&
                bank.equals(that.bank) &&
                type.equals(that.type) &&
                currency.equals(that.currency);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", bank='" + bank + '\'' +
                ", type='" + type + '\'' +
                ", creditLimit=" + creditLimit +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardNumber, bank, type, creditLimit, currency);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
