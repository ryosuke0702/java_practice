package sample;

public class test2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println("第" + (i+1) + "引数:" + args[i]);
            i++;
        }
    }
}
