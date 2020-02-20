package CyrenceHomeWork;

public class Yuan extends CURNC implements INTERF {
    public Yuan(double kursNbu) {
        super(kursNbu);
    }

    @Override
    public String getname() {
        return "юань";
    }

    @Override
    public boolean isfreeconv() {
        return true;
    }
}
