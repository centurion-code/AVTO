package com.company;

import LIBS.WorkWithMassive;

public class Main {

    public static void main(String[] args) {
	int []mass={5,7,5,36,45,78,40,25,12,36,45,98};
	for(int i=0;i<mass.length;i++){
	    if(mass[i]%2==0){
            System.out.println(mass[i]+" это четное число");
        }
	    else if(mass[i]%2!=0){
            System.out.println(mass[i]+" это нечетное число");
        }
    }
	int mass1[][]=new int[5][5];
        for(int i=0;i<mass1.length;i++){
            for(int j=0;j<mass1[i].length;j++){
                mass1[i][j]=1;
        }

    }
	for(int i=0;i<mass1.length;i++){
	    for(int j=0;j<mass1[i].length;j++){
            System.out.print(mass1[i][j]);
    }
        System.out.println();}
        System.out.println(mass1.length);
        System.out.println(mass.length);

        String str[]=new String[5];
        for(int i=0;i<str.length;i++){

            str[i]="test "+(i+1);
        }
        for(String s:str){
            if(s.equals("test 3")){
                System.out.println("this is \"test 3\" "+s);
            }
            else
            System.out.println(s);
        }
     Main.del(5,2);

    }
    public static void del(int a,int b){
        double res=(double)a/b;
        System.out.println(res);

    }


}


