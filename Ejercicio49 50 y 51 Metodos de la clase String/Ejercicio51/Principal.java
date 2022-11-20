import java.util.*;


public class Principal {

    String a;
    String b;

    public Principal(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public String setB(String b) {
        this.b = b;
        return b;
    }

    public static void main(String[] args) {
        String a = new String("Hello World");
        String b = new String("Hello World");


        }
        System.out.println(a.equals(b));
    }
