package pl.edu.uwm.po.lab_01;
import java.lang.Math;

public class Start {
    public static void main(String[] args) {
        //System.out.println(z01());
        //System.out.println(z02());
        //System.out.println(z03());
        //z04();
        //z05();
        //z06();
        //z09();
        //z10();
        //z11();
        z12();
    }
    static int z01 () {
        return 31 + 29 + 31;
    }
    static int z02 () {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
    static int z03 () {
        int il=1;
        for (int i=1;i<=10;i++){
            il*=i;
        }
        return il;
    }
    static void z04 () {
        float s=1000;
        for (int i=1;i<=2;i++){
            s*=1.06;
            System.out.println(Math.round(s * 100.0) / 100.0);
        }
    }
    static void z05 () {
        System.out.println("+----+");
        System.out.println("|JAVA|");
        System.out.println("+----+");
    }
    static void z06 () {
        System.out.println("  /////");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("(| o o |)");
        System.out.println("  | ^ |");
        System.out.println(" | `-' |");
        System.out.println(" +-----+");
    }
    static void z09 () {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@//      //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@#    @@@@@@@@@@@@@@@@,   *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@(  @@@@@@@@@@@@@@@@@@@@@@@@@@@@  /@@@@@@@@@@@@@@@@@@@@@&#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@  @@@@@@@ HELLO JUNIOR @@@@@@@@@@@@@  &@@@@@@@@@@@@@@@ /(((( @@%    &@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@  @@@@@@@@@@@@@ CODER! @@@@@@@@@@@@@@@@@  @@@@@@@@@@@@.*(((((/ ((((((( @@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ &@@@@@@@@@#*(((((/(((((*  @@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ &@@@@@@@@@#*(((((/(((((*  @@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@ #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@& @@@@@@@@. ((((((((((((((((((* @@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@ @@@@@@@@@@@@ You're just watching @@@@@@@@@@ &@@@@ ,((((((((((((*..*((((((((* @@@@@@@@@@@@@@@@@@");
        System.out.println("@@@ #@@@@@@@@@@@ on a blue bird from @@@@@@@@@@@ @@@ ..@@@@% (((( @@@@@@@@@ ((((((( &@@@@@@@@@@@@@@@");
        System.out.println("@@@% @@@@@@@@@@@ game 'Angry bird'! @@@@@@@@@@@ /@@ ,@@@@@@@@@ /%@/@@@@@@@@@.(((((((( %@@@@@@@@@@@@@");
        System.out.println("@@@@* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@  @   @@@@@@ ,@   @@@@@@@@.(((((((((# @@@@@@@@@@@@");
        System.out.println("@@@@@@, @@@@@@@@@@ Beautiful one? @@@@@@@@@@  *@@ #  .(@% ,######/ #@@@@@%* / (((((((((( @@@@@@@@@@@");
        System.out.println("@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  / ,@@@ (  *################ //////**(((((((((/.@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@   /@@@@@@@@@@@@@@@@@@@@/   @@@, @@@/ (#####################*.// (((((((((((( @@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@                @@@@@@@@@  @# ########/,                 *((((((((((((( @@      @@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%     (@@@@@@@( @#@//(((((((/*#.   ..,,.   ### (((((((((((((      */ &@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.      @@@ ((((((*(#   ,,,,,,. #####.(((((((((((((     &@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//@@@ ((((*(#  ,,,,,, /######.((((((((((((( @@@@    @@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ((#,## ,,,, ,########,((((((((((((( @@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.,##,   #######%* .((((((((((((( %@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*#######, ,(((((((((((((((((/ @@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  . ((((((((((((((((((((  @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&*     ...    *@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    static void z10 () {
        System.out.println("No.1. Sweeney Todd: The Demon Barber from Fleet Street");
        System.out.println("No.2. Imaginaerum");
        System.out.println("No.3. Skyfall");
    }
    static void z11 () {
        System.out.print("Wywód Jestem’u\n" +
                "Miron Białoszewski\n"+
                "\n" +
                "jestem sobie\n" +
                "jestem głupi\n" +
                "co mam robić\n" +
                "jak nie wiedzieć\n" +
                "a co ja wiem\n" +
                "co ja wiem\n" +
                "co ja jestem\n" +
                "wiem, że jestem\n" +
                "taki jak jestem\n" +
                "może nieglupi\n" +
                "ale to może tylko dlatego że wiem\n" +
                "że każdy dla siebie jest najważniejszy\n" +
                "bo jak się na siebie nie godzi\n" +
                "to i tak taki jest się jaki jest");
    }
    static void z12() {
        System.out.println("* * * * * * =====================================");
        System.out.println(" * * * * *");
        System.out.println("* * * * * * =====================================");
        System.out.println(" * * * * *");
        System.out.println("* * * * * * =====================================");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("=================================================");
    }
}
