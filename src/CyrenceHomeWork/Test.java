package CyrenceHomeWork;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[]args){
        UzDoll ud=new UzDoll(0.5);
        Yuan ya=new Yuan(0.2);
        System.out.println(ud.getKursNbu());
        ud.setKursNbu(0.7);
        System.out.println(ud.getKursNbu());
        System.out.println(ya.getKursNbu());
        ya.setKursNbu(0.1);
        System.out.println(ya.getKursNbu());
        ud.Exchange(500);
        ya.Exchange(40);
        System.out.println(ud.isfreeconv());
        System.out.println(ya.isfreeconv());
    }
}
