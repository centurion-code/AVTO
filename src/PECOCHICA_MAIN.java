import LIBS.WorkWithMassive;
import jdk.swing.interop.SwingInterOpUtils;

public class PECOCHICA_MAIN {
    public static void main(String[]args){
        WorkWithMassive wm=new WorkWithMassive();
        //wm.createMatrice(5,5,1);
        int [][]mas=new int[5][5];
        wm.fullmatrice(mas,5);
        wm.printMassive(mas);
        System.out.println();
        wm.fullofmatrice(mas,5,1);
        wm.printMassive(mas);
        System.out.println();
        wm.createMatrice(5,5,1);
        System.out.println(mas.length);
        System.out.println("---------");
        wm.fullofmatrice(mas,5,1);
        wm.printMassive(mas);
        System.out.println();
        wm.matriceDiagonal(mas,2);
        System.out.println();
        wm.FullCrossMatriceDiagonal(5, 5, 1, 1, 0);
        wm.FullCrossMatriceDiagonal(5,4,4,5,1);




    }
}
