package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 入力パラメータを読み込む
        String input = br.readLine();
String[] param = input.split(" ");//入力値を空白で分解する
    System.out.println(input);
    }
}