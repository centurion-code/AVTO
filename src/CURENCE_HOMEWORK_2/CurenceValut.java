package CURENCE_HOMEWORK_2;

abstract public class CurenceValut {
    private double kursNbu;
    private double marga=0.2;
    public CurenceValut(double kursNbu){
        this.kursNbu=kursNbu;
    }
    public double getCurs(){
        return kursNbu;
    }
    public void setKurs(double kursNbu){
        this.kursNbu=kursNbu;
    }
    public double getMarga(){
        return marga;
    }
    public void setMarga(double marga){
        this.marga=marga;
    }
    public double exchange(int sum){
        double result=sum*kursNbu*(1-marga);
        System.out.println("за "+sum+" "+getName()+ " вы получаете "+result+" гривень");
        return result;
    }
    public double exchangeReturn(int sum){
        double res=sum/kursNbu*(1-marga);
        System.out.println("за "+sum+" гривень вы получаете "+res+" "+getName());
        return res;
    }
    abstract String getName();
}
