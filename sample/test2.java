package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
    public static void main(String[] args) {
        try {
            InputStreamReader i = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(i);
            String input = b.readLine();
            System.out.println(input);
        }   catch ( IOException e) {
            System.out.println("入力エラー");
        }
        // TODO 自動生成されたメソッド・スタブ

    }

}
