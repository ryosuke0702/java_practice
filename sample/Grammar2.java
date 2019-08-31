package sample;

public class Grammar2 {

    public static void main(String[] args) {
        try {
            String buf = null;
            System.out.println(buf.length());
        } catch (NullPointerException e1) {
            e1.printStackTrace();
        }

        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }

        try {


        } catch (ClassCastException e3) {
            e3.printStackTrace();
        }
    }
}
