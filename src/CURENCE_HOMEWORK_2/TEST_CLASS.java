package CURENCE_HOMEWORK_2;

import jdk.swing.interop.SwingInterOpUtils;

public class TEST_CLASS {
    public static void main(String[]args){
        Dollar dollar=new Dollar(28.5);
        Euro euro=new Euro(30.5);
        Ruble ruble=new Ruble(0.25);
        System.out.println("dollar is "+dollar.getCurs());
        System.out.println("euro is "+euro.getCurs());
        System.out.println("ruble is "+ruble.getCurs());
        System.out.println("-------------");
        dollar.setKurs(24.5);
        euro.setKurs(28.5);
        ruble.setKurs(0.3);
        System.out.println("dollar is "+dollar.getCurs());
        System.out.println("euro is "+euro.getCurs());
        System.out.println("ruble is "+ruble.getCurs());
        System.out.println("------------");
        dollar.exchange(250);
        euro.exchange(280);
        ruble.exchange(5000);
        dollar.exchangeReturn(15000);

    }
}
