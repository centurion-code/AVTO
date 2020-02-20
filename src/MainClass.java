import LIBS.Calc;
import LIBS.WorkWithMassive;
import com.company.Main;
import jdk.swing.interop.SwingInterOpUtils;
import Currency.*;
import org.apache.log4j.Logger;

import java.awt.geom.QuadCurve2D;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello");
        Calc myCalk = new Calc();
        myCalk.summ(74, 75);
        Calc.subtr(47, 4);
        int var1, var2;
        var1 = 10;
        var2 = 10;
        System.out.println("result=" + (var1 + var2));
        int mass[] = {2, 4, 26, 7, 28, 10, 9, 20, 33};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 10) {
                System.out.println(mass[i] + " этот элемент меньше 10");
            } else if (mass[i] == 10) {
                System.out.println(mass[i] + " этот элемент равен 10");
            } else if (mass[i] > 10) {
                System.out.println(mass[i] + " этот элемент больше 10");
            }
        }
        myCalk.devision(5, 2);
        myCalk.summ("hello", "friend");
        myCalk.summ("hello", 5);
        Calc.subtr(45, 22);
        myCalk.summ("hhhh", 5);
        String s = myCalk.summa("hello", 55);
        System.out.println(s);
        myCalk.summa(55, "5555");
        myCalk.summm("55", "5f5");
        int[][] masiveMasive = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        WorkWithMassive WorkWithMassive = new WorkWithMassive();
        WorkWithMassive.printMassive(masiveMasive);
        System.out.println();
        int[][] masiveMasive_2 = new int[7][6];
        WorkWithMassive.printMassive(masiveMasive_2);
        System.out.println();
        int[][] matrice = new int[5][5];
        WorkWithMassive.fullmatrice(matrice, 5); //заполнили матрицу
        WorkWithMassive.printMassive(matrice);//вывели матрицу

        int matricediagonal[][] = new int[10][10];   //создаем матрицу
        WorkWithMassive.fullofmatrice(matricediagonal, 5, 10); //заполняем 10 и диагональ 5
        WorkWithMassive.printMassive(matricediagonal);//выводим

        //List
        List<String> ourList = new ArrayList();   //arraylist это аналог одномерного массива
        ourList.add("test");//добавляем элемент в лист
        ourList.add("test1");
        System.out.println(ourList);
        System.out.println(ourList.get(0));//получаем чистое значение без [] скобок
        System.out.println("size= " + ourList.size());//размер листа
        ourList.remove(0);//удаление элемента
        System.out.println(ourList);
        ourList.add("test2");
        System.out.println(ourList);
        ArrayList<String> ourList2 = new ArrayList<>();//создаем новый список
        ourList2.add("value1");
        ourList2.addAll(ourList);//добавляем в него список ourlist  в конец
        System.out.println(ourList2);
        ourList2.addAll(0, ourList);//здесь с помощью индекса добаляем в начало списка
        System.out.println(ourList2);
        System.out.println();

        List<List<Integer>> ourListlIST = new ArrayList<>();//создаем список списков
        ourListlIST.add(new ArrayList<Integer>()); //ДОБАВЛЯЕМ ЕЩЕ ОДИН СПИСОК
        ourListlIST.get(0).add(11); //обращаемся к большому списку и говорим ему найди первую строку и добавь туда значение
        ourListlIST.get(0).add(12);
        ourListlIST.add(new ArrayList<Integer>());//добавляем новую строку
        ourListlIST.get(1).add(10);  //записываем в эту строку значения
        ourListlIST.get(1).add(50);
        ourListlIST.get(1).add(54);
        ourListlIST.add(new ArrayList<Integer>());
        ourListlIST.get(2).add(5747);
        ourListlIST.get(1).remove(2);
        System.out.println(ourListlIST.get(1).get(1));//вывод конкретного элемента списка
        ourListlIST.add(new ArrayList<>());
        ourListlIST.get(3).add(46868);
        ourListlIST.get(3).add(0, 577);
        ourListlIST.get(1).add(0, 467); //добавляем в 1 список 8 на место с индеком 0, она встанет вначале
        ourListlIST.add(1, new ArrayList<Integer>()); //добавляем новую строку на в лист на место с индексом 1
        ourListlIST.add(2, new ArrayList<Integer>());
        ourListlIST.get(1).add(55);
        ourListlIST.get(2).add(25);
        ourListlIST.get(1).add(0, 50);
        ourListlIST.get(1).add(2, 556);
        System.out.println(ourListlIST);
        System.out.println();

        ArrayList<Integer> listInteger = new ArrayList<>(); //создаем новые листы
        listInteger.add(555); //добавляем в него элементы
        listInteger.add(66);
        listInteger.add(777);
        System.out.println(listInteger);
        ArrayList<Integer> listInteger2 = new ArrayList<>();
        listInteger2.addAll(listInteger);//добавляем в один лист другой
        listInteger2.add(55555);
        System.out.println(listInteger2);

        ourListlIST.add(new ArrayList<>());
        ourListlIST.get(0).addAll(listInteger); ///-здесь мы переписали с олл, потому что так мы просто переписываем значение в лист а не ссылку
        System.out.println(ourListlIST);
        //  ourListlIST.add(0,listInteger); //добавляем в лист листы ///-здесь переписываеться ссылка

        ourListlIST.add(listInteger2);
        System.out.println(ourListlIST);

        listInteger.add(999); //добавляем новое значение в лист  ///- и в таком случае, если бы мы использовали просто add то у нас и в ourlistList отображались бы изменения
        ourListlIST.add(listInteger); // и помещаем его в двумерный лист
        System.out.println(listInteger);
        System.out.println(ourListlIST);

        listInteger2.add(1000000); //здесь добавили элемент в listinteger2 и так как listinteger2 добавлен в ourlistList, то эти
        System.out.println(ourListlIST);// изменения отобрязаться и в ourlistList, так как он содержит ссылку, ourlist2 добавлен с помощью add
        System.out.println(ourListlIST.size()); //размер листа

        //в коллекциях есть листы а есть отображения, где данные представлены ключ знаачение
        HashMap<String, String> ourMap = new HashMap<>();//СОЗДАЛИ ПУСТУЮ МАПКУ
        ourMap.put("key1", "test");
        System.out.println(ourMap);
        System.out.println(ourMap.get("key1"));
        ourMap.put("key2", "test2");
        System.out.println(ourMap);
        System.out.println(ourMap.get("key2"));
        System.out.println(ourMap.get("key3"));
        System.out.println();

        ArrayList<HashMap<String,String>>ourListMap=new ArrayList<>();//СОЗДАЕМ АРЕЙЛИСТ ВНУТРИ КОТОРОГО БУДЕТ ХЕШМАПКА,ПЕРЕМЕННАЯ КОТОРАЯ СОДЕРЖИТ СПИСОК МАПОК
        ourListMap.add(new HashMap<>());
        ourListMap.get(0).put("login","value11"); //заполняем мапку
        System.out.println(ourListMap);
        ourListMap.get(0).put("pass","value");
        ourListMap.get(0).put("status","srudent");
        System.out.println(ourListMap);

        ourListMap.add(new HashMap<>()); //ДОБАВЛЯЕМ ДРУГУЮ СТРОКУ
        ourListMap.get(1).put("login2","value12"); //заполняем мапку
        System.out.println(ourListMap);
        ourListMap.get(1).put("pass1","value2");
        ourListMap.get(1).put("status1","srudent1");
        System.out.println(ourListMap);
        System.out.println();

        ourListMap.add(new HashMap<>()); //ДОБАВЛЯЕСМ ЕЩЕ ОДНУ МАПКУ
        ourListMap.get(2).putAll(ourMap); //перезаписываем туда ourmap PUTALL ПЕРЕЗАПИСЫВАЕТ ЗНАЧЕНИЕ
        System.out.println(ourListMap);
        ourListMap.add(ourMap); //ТОЖЕ ДОБАВЛЯЕМ. ДО ЭТОГО ТАК НЕ РАБОТАЛО МЫ ДОБАВИЛИ HASH ПЕРЕД MAP В МОМЕНТ СОЗДАНИЯ OURMAP . ADD ДОБАВЛЯЕТ ССЫЛКУ
        System.out.println(ourListMap);
        System.out.println();
        for (HashMap hashmap:ourListMap //циклом foreach выводим элементы листа. со списка outlistmap каждый элемент будет записываться в переменную hashmap и выводиться
             ) {
            System.out.println(hashmap);
        }
        System.out.println("----------------------------------");
        //----------------------Currency----------------------------
        Dollar dollar=new Dollar(28);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(28.5);
        System.out.println(dollar.getKursNBU());
        System.out.println("------------");
        Evro euro=new Evro(30);
        System.out.println(euro.getKursNBU());
        euro.setKursNBU(30.5);
        System.out.println(euro.getKursNBU());
        dollar.setKursNBU(26);
        System.out.println(dollar.getKursNBU()+" this is a dollar");
        System.out.println(dollar.getMarga());
        System.out.println(euro.getMarga());
        dollar.exchangeCurrencyToGrn(100);
        euro.exchangeCurrencyToGrn(100);
        System.out.println(dollar.isFreeConverted());
        Bitcoin bitcoin=new Bitcoin(3000);
        System.out.println(bitcoin.getKursNBU());
        bitcoin.exchangeCurrencyToGrn(5000);
        System.out.println(bitcoin.getMarga());
        bitcoin.setMarga(0.2);
        System.out.println(bitcoin.getMarga());

//----------------LOG--------------------------------

        Logger logger=Logger.getLogger(MainClass.class);//создаем обьект лог
        logger.info("test info"); //вызываем его методы
        logger.debug("test debug");
        logger.error("test error");


        System.out.println("----end of programm-----");
    }
}