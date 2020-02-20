package Currency;

import java.sql.SQLOutput;

public class Bitcoin extends Currency {
    public Bitcoin(double kursNBUxt) {
        super(kursNBUxt);
    }

    @Override
    public String getCurrencyName() {
        return "Bitcoin";
    }
    public double exchangeCurrencyToGrn(double numberOfCurrency){ //переопределяем метод, чтобы нельзя было поменять
        System.out.println("операция запрещена нацбанком");
        return numberOfCurrency;
    }
}
