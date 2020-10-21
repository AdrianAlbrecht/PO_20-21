package pl.edu.uwm.po.lab_01;

public class Lab_04 {
    public static int countChar(String str,char c){
        return (int)str.chars().filter(ch -> ch == c).count();
    }
    public static int countSubStr(String str, String subStr){
        int len_str=str.length();
        int len_subStr=subStr.length();
        if(str.isEmpty()||subStr.isEmpty()||len_subStr>len_str){
            return 0;
        }
        int index=0;
        int count=0;
        String temp;
        while(len_str-index>=len_subStr){
            temp=str.substring(index,index+(len_subStr));
            if(temp.equals(subStr)) count++;
            index++;
        }
        return count;
    }
    public static String middle(String str){
        int dlugosc=str.length();
        if(dlugosc%2!=0){
            return String.valueOf(str.charAt(dlugosc/2));
        }
        else {
            dlugosc= (int)(dlugosc/2);
            return str.substring(dlugosc-1,dlugosc+1);
        }
    }
    public static String repeat(String str,int n){
        StringBuilder nowy= new StringBuilder();
        for(int i=0;i<n;i++){
            nowy.append(str);
        }
        return nowy.toString();
    }
    public static int[] where(String str, String subStr){
        int[] wystapienia= new int[Lab_04.countSubStr(str,subStr)];
        if(wystapienia.length>0){
            String temp= str;
            wystapienia[0]=temp.indexOf(subStr);
            for(int i=1;i<wystapienia.length;i++){
                temp=str.substring(wystapienia[i-1]+1);
                wystapienia[i]=temp.indexOf(subStr)+wystapienia[i-1]+1;
            }
        }
        return wystapienia;
    }
    public static String change(String str){
        StringBuffer zamiana= new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))) zamiana.append(String.valueOf(str.charAt(i)).toLowerCase());
            else zamiana.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        return zamiana.toString();
    }
    public static String nice(String str){
        StringBuffer dziesietne= new StringBuffer();
        int it=1;
        for(int i=(str.length()-1);i>=0;i--){
            dziesietne.append(str.charAt(i));
            if(it%3==0 && i!=0)  dziesietne.append("'");
            it++;
        }
        String temp= dziesietne.toString();
        dziesietne=new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            dziesietne.append(temp.charAt(i));
        }
        return dziesietne.toString();
    }
    public static String nice(String str,char znak, int n){
        StringBuffer dziesietne= new StringBuffer();
        int it=1;
        for(int i=(str.length()-1);i>=0;i--){
            dziesietne.append(str.charAt(i));
            if(it%n==0 && i!=0)  dziesietne.append(znak);
            it++;
        }
        String temp= dziesietne.toString();
        dziesietne=new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            dziesietne.append(temp.charAt(i));
        }
        return dziesietne.toString();
    }
}
