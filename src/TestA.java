import java.util.ArrayList;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class TestA {

    public static void change(String s) {
        s = s + "s";
    }

    public static void change(StringBuilder s) {
        s = s.append("s");
    }

    public static void main(String[] args) {
//        String s = "a";
//        change(s);
//        System.out.println(s);
////        ArrayList
//        StringBuilder sb = new StringBuilder("a");
//        change(sb);
//        System.out.println(sb.toString());
        int a = 10;
        int b = 3;
        System.out.println(Math.floorDiv(10, 3));
    }
}