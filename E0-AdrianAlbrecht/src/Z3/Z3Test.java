package Z3;

import java.io.File;

public class Z3Test {
    public static void main(String[] args) {
        File[] nazwy_plikow = rozszerzenia("C:\\Users\\adria\\Desktop\\Bzdety","jpg");
        for( File n: nazwy_plikow){
            System.out.println(n.getName());
        }
    }
    public static File[] rozszerzenia(String path,String rozszerzenie){
        File kat_glowny= new File(path);
        return  kat_glowny.listFiles((x,y)->y.endsWith(rozszerzenie));

    }
}
