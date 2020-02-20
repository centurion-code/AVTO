package Currency;

public class Evro extends Currency implements  ConvertedCurrency {
    public Evro(double kursNBUxt) {
        super(kursNBUxt);
    }

    @Override
    public String getCurrencyName() {
        return "evro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
