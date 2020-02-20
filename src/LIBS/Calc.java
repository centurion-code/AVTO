package LIBS;

public class Calc {
    /**
     * @param dodanok1
     * @param dodanok2
     */
    public void summ(int dodanok1, int dodanok2) {
        int sum = dodanok1 + dodanok2;
        System.out.println("summ= " + sum);
    }

    public static void subtr(int a, int b) {
        System.out.println("subtr =" + (a - b));
    }


    public void devision(double a, double b) {
        try {
            double div = a / b;
            System.out.println("division is " + div);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя " + e);
        }

    }

    public void summ(String a, String b) {
        System.out.println(a + " " + b);
    }

    /**
     * sum str int
     *
     * @param a
     * @param b
     */
    public void summ(String a, int b) {
        System.out.println("sum is " + (a + b));
    }

    public String summa(String a, int b) {
        return a + " " + b;
    }

    public int summa(int a, String b) {
        int res = a + Integer.parseInt(b);  //парсим стринг, переводим посимвольно в интеджер
        System.out.println("result is " + res);
        return res;
    }

    public int summm(String a, String b) {
        try {
            int res = Integer.parseInt(a) + Integer.parseInt(b);//преобразуем цифры в стринге в интеджер
           System.out.println("result=" + res);        //обрабатываем эксепшон, на случай парсинга символа, потому что джава буквы в инт
            return res;                                // не умеет парсить
        } catch (NumberFormatException e) {
            System.out.println("wrong format");
            return 9999;
        }
        catch (Exception e) {
            System.out.println("erorr " + e.getMessage());
            return 8888;  //здесь возврашаем что то , потому что метод возвращает
        }
    }

}
