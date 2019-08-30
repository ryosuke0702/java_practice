package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        String enzan;

        int num1 = Integer.parseInt(param[0]);
        int num2 = Integer.parseInt(param[2]);
        enzan = param[1];

        if (enzan.equals("+")) {
            System.out.println(num1 + num2);
        } else if (enzan.equals("-")) {
            System.out.println(num1 - num2);
        } else if (enzan.equals("*")) {
            System.out.println(num1 * num2);
        } else if (enzan.equals("/")) {
            System.out.println(num1 / num2 + "..." + num1 % num2);
        }

    }
}