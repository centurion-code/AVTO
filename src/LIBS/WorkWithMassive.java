package LIBS;

public class WorkWithMassive {
    public void printMassive(int mas[][]) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fullmatrice(int matrice[][], int a) { //метод заполняет матрицу
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = a;
            }
        }
    }

    public void fullofmatrice(int[][] matrice, int a, int b) {  //метод принимает матрицу на вход, и два значение
        for (int i = 0; i < matrice.length; i++) {              // одно для заполнение матрицы, другое для диагонали
            for (int j = 0; j < matrice[i].length; j++) {
                if ((matrice[i] == matrice[j]))
                    matrice[i][j] = a;
                else {
                    matrice[i][j] = b;
                }
            }

        }
    }

    public int[][] createMatrice(int x, int y, int value) {  //метод получает на вход размеры матрицы
        int[][] matrice1 = new int[x][y];                      // и значение заполнения
        for (int i = 0; i < x; i++) {                 //также создает внутри себя массив и используя метод hrintMassive
            for (int j = 0; j < y; j++) {          //выводит матрицу
                matrice1[i][j] = value;
            }

        }
        printMassive(matrice1);
        return matrice1;
    }

   public int[][]FullCrossMatriceDiagonal(int x,int y,int left,int right,int value){ //метод принимает на вход размер матрицы(x,y), значение для левой диагонали, правой и значение для заполнения
        int[][] crossMatrice=new int[x][y];                                         //создает матрицу
        fullmatrice(crossMatrice,value);                                            //заполняет матрицу

       for(int i=0;i<crossMatrice.length;i++){                              // проверяет квадратная ли она
           if(crossMatrice[i].length!=crossMatrice.length){
               System.out.println("not square");
               return  crossMatrice;
           }}
           for(int i=0;i<crossMatrice.length;i++){                  //заполняет правубю диагональ
           for(int j=0;j<crossMatrice[i].length;j++){
               if(crossMatrice[i]==crossMatrice[j]){
                   crossMatrice[i][j]=left;
               }
                for(int g=0;g<crossMatrice.length;g++){            //заполняет левую диагональ
                    for(int h=0;h<crossMatrice[g].length;h++){
                 if(i==crossMatrice.length-j-1){
                     crossMatrice[i][j]=right;}
                 }}



           }
       }
       printMassive(crossMatrice);  //выводит массив
       return crossMatrice;
    }



    public int [][]matriceDiagonal(int[][] matr,int value){ // метод заполняет правую диагональ
        for(int i=0;i<matr.length;i++){                     //принимает на вход заполненую матрицу и значение для диагонали
            if(matr.length!=matr[i].length){                //сначала проверяет квадратная ли матрица, для этого проходит по каждой строке матрицы
                System.out.println("not square");           //и проверяет равна ли она дли всей матрицы
                return matr;                                //затем в цикле проходит по каждой строке и сравнивает если
            }                                               //i равно длина матрицы минус индекс строки минус 1, то это индексы правой диагонали
        }                                                   //то есть индекс строки i(i-тый элемент j строки) равен длинна всей матрицы(кол-во строк) минус индекс строки в матрице и минус 1
        for(int i=0;i<matr.length;i++){
            for(int j=0;j<matr[i].length;j++){
                if(i==matr.length-j-1){
                    matr[i][j]=value;
                }
            }
        }
        printMassive(matr);
        return matr;
    }

}
