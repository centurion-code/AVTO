package Currency;

abstract public class Currency { //абстрактный класс, с него нельзя создать обьект
    private double kursNBU;   //асбтракный класс нужен для вынесения общих свойств
     private  double marga=0.1;                         //все кто от него будут наследоваться получат эти свойства
    public Currency(double kursNBUxt){  //создаем конструктор, чтобы для каждой валюты можно было задать значение
        kursNBU=kursNBUxt;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }
    public double exchangeCurrencyToGrn(double amountCurrency){  //метод считает обмен валюты с учетом маржи
        double tempResult=amountCurrency*kursNBU*(1-marga);
        System.out.println("for "+amountCurrency+" "+getCurrencyName()+" you get "+tempResult+" grn");
        return tempResult;
    }
    abstract public String getCurrencyName();//абстрактный метод, гарантирует нам, что все кто
                                            //наследуеться от этого класса, должен иметь этот метод
                                            //реализация полагаеться на наследника
}
