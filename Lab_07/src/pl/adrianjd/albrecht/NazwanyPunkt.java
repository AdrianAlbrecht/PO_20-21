package pl.adrianjd.albrecht;

public class NazwanyPunkt extends Punkt {
    private String name;

    NazwanyPunkt(int var1, int var2, String var3) {
        super(var1, var2);
        this.name = var3;
    }

    public void show() {
        System.out.println(this.name + ":<" + this.x() + ", " + this.y() + ">");
    }
}
