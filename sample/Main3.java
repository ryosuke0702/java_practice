package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する

        int sum = Integer.parseInt(param[0]);

        //System.out.println("length:" + param.length);

        for (int i = 2; i < param.length; i += 2) {
            int num = Integer.parseInt(param[i]);
            //System.out.println("Index" + i);
            if (param[i - 1].equals("+")) {
                sum = sum + num;
                //System.out.println("たす" + sum);
            } else if (param[i - 1].equals("-")) {
                sum = sum - num;
                //System.out.println("引く" + sum);
            }

        }
        System.out.println("最終結果" + sum);
    }
}