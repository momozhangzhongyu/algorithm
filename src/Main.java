public class Main {

    public static void main(String[] args) {
        String s1= new String("ab") + new String("cd");
        s1.intern();
        String s2 = "abcd";

        System.out.println(s1 == s2);
    }
}
