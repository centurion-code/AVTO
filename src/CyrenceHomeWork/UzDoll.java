package CyrenceHomeWork;

public class UzDoll extends CURNC implements INTERF{
    public UzDoll(double kursNbu) {
        super(kursNbu);
    }

    @Override
    public String getname() {
        return "узбекский доллар";
    }

    @Override
    public boolean isfreeconv() {
        return false;
    }
}
