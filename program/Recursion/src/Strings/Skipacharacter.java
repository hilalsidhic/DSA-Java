package Strings;

public class Skipacharacter {
    public static void main(String[] args) {
        skip("","baashahfdsjfklaajkfaaaaa");
        System.out.println(skip1("hilalafhappledsfa"));
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p+"",up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }
    public static String skip1(String p){
        if(p.isEmpty()){
            return "";
        }

        if (p.startsWith("apple"))
            return skip1(p.substring(5));
        else
            return p.charAt(0)+skip1(p.substring(1));

    }
}
