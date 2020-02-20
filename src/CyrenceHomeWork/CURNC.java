package CyrenceHomeWork;

 abstract public class CURNC {
    private double kursNbu;
    private double marga=0.3;
    public CURNC(double kursNbu){
        this.kursNbu=kursNbu;
    }

    public double getKursNbu() {
        return kursNbu;
    }

    public void setKursNbu(double kursNbu) {
        this.kursNbu = kursNbu;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }
    public double Exchange(int sum){
        double res=sum*kursNbu*(1-marga);
        System.out.println("за "+sum+" "+getname()+" вы получите "+res+" гривень");
        return res;
    }
    abstract public String getname();
}
