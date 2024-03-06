public class string{
    public static void main(String[] args){
        String str = new String("Hello World");
        String str1 = new String("abrambabasc");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim()); // remove spaces only at end and start of string
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str1.replaceAll( "b|as", "" )); 
    }
}