package ExException.models.entities;

import ExException.models.exceptions.ValueException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double value) throws ValueException{
        if(value != null && value>0){
            balance += value;
        }else {
            throw new ValueException("Valor inesperado");
        }
    }

    public void withdraw(Double value) throws ValueException{
        if(value > withdrawLimit){
            balance -= value;
        }
    }

    public String toString(){
        return String.format("Number: %d, Holder: %s, Balance: %.2f", getNumber(), getHolder(), getBalance());
    }

}
