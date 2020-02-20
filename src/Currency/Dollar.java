package Currency;

public class Dollar extends Currency implements ConvertedCurrency{
    public Dollar(double kursNBUxt) { //СОЗДАЕМ конструктор соответствующий родительскому классу
        super(kursNBUxt); //при создании доллара передадим значение курса
    }                     // которое перейдет в метод супер родительского классал

    @Override
    public String getCurrencyName() {
        return "dollar";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
