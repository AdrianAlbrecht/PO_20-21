package pl.edu.uwm.po.ajp_z01;

public class Greeter implements Runnable{
    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i=0;i<n;i++){
            System.out.println("Witaj"+target);
        }
    }
    private String target;
    private int n;
}
