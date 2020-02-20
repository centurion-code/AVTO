package CURENCE_HOMEWORK_2;

public class Dollar extends CurenceValut{
    public Dollar(double kursNbu) {
        super(kursNbu);
    }

    @Override
    String getName() {
        return "dollar";
    }
}
