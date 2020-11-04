package pl.adrianjd.albrecht;

public class Adres {
    public Adres(String ulica, String numer_domu, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
    }
    public Adres(String ulica, String numer_domu, String numer_mieszkania, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy+" "+this.miasto);
        System.out.print(this.ulica+" "+this.numer_domu);
        if(!this.numer_mieszkania.equals("")){
            System.out.print("/"+this.numer_mieszkania);
        }
        System.out.println();
    }
    public boolean przed(Adres kodzik){
        int[] tab={0,1,3,4,5};
        StringBuilder first= new StringBuilder();
        StringBuilder kod= new StringBuilder();
        for(int i : tab){
            first.append(kodzik.kod_pocztowy.charAt(i));
            kod.append(this.kod_pocztowy.charAt(i));
        }
        int f=Integer.parseInt(first.toString());
        int k=Integer.parseInt(kod.toString());
        return f<k;
    }


    private String ulica;
    private String numer_domu;
    private String numer_mieszkania="";
    private String miasto;
    private String kod_pocztowy;
}
