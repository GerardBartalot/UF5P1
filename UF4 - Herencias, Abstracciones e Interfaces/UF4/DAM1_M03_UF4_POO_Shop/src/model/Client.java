package model;

import main.Payable;
import model.Amount;

public class Client extends Person implements Payable {
	
	
    private  int memberId;
    private Amount balance;

    public Client(String name) {
        super(name);
        memberId = 456;
        balance = new Amount(50.00,"€");
    }

    @Override
    public boolean pay(Amount amount) {
        Amount finalBalance = balance.subtract(amount);
        balance.setValue(finalBalance.getValue());
        if (finalBalance.getValue() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getMemberId() {
        return memberId;
    }

    public Amount getBalance() {
        return balance;
    }
}

