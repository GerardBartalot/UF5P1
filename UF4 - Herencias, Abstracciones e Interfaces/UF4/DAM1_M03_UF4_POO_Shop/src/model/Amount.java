package model;

public class Amount {
    private double value;
    private String currency;

    public Amount(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, currency);
    }

    public Amount subtract(Amount amount) {
        double result = this.value - amount.getValue();
        return new Amount(result, this.currency);
    }
}


