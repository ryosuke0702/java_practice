package sample;

/* class Test {
    int i = 10;
    int j = i * 2;

    int sum(int m) {
        return j + m;   //20+3 returnで戻り値がメソッドに返る、11行目
    }
    int sum3(int m, int n) {    //(1,5)
        int k = sum(3);     //7行目の int sum(int m)に代入    sum=23
        return m + n + k;   //1+5+23    かつ戻り値がreturnでメソッドに返される、19行目、結果29が出力される
    }
}

public class JavaSampleClass {
    public static void main(String[] args) {
      Test t = new Test();  //tオブジェクトが作成される、インスタンス化 t
      System.out.println("tオブジェクトのメソッド" + "sum3(1,5)の結果:" + t.sum3(1,5));   //sum3(1,5)を10行目に代入





          for (int i = 0; i < 10; i++) {
            if (i > 5) {
            return; // for文の中でもreturnできる
            }
           }

           int i = 0;
           while (i < 10) {
            if (i > 5) {
            return; // while文の中でもreturnできる
            }
           }

           int j = 0;
           switch(j) {
           case 0:
            break;
           case 1:
            return; // switch文の中でもreturnできる
           }

           int k = 0;
           if (k > 10) {
            return; // if文の中でもreturnできる
           }


        // TODO 自動生成されたメソッド・スタブ


           boolean b;
        b = (5 > 2);
        if(!b)
             System.out.println("合っている");
        else
             System.out.println("間違っている");

        int a;
        int b = 25;
        a = ++b;
        System.out.println(a);

        String str = "こんにちはははははは";
        //System.out.println(str);
        int len = str.length();
        System.out.println(len);

        String str = "アイウエオ";
        char c = str.charAt(0);
        System.out.println(c);

        boolean b = true;
        System.out.println(b);

        int[] data = new int[]{ 10, 11, 12, 8, 7, 5, 7, 11, 12, 13 };
        System.out.println("data[0]:" + data[0]);
        System.out.println("data[5]:" + data[5]);
        int i = data.length;
        System.out.println("配列の長さ:" + i);

        char[] c = new char[] { 'a', 'b', 'c' };
        System.out.println(c[0]);

        if (args.length > 0)
            System.out.println("第一引数:" + args[0]);

        int i = args.length; //引数の数
        if(i % 2 == 0)
            System.out.println("引数の数は偶数です");
        else
            System.out.println("引数の数は奇数です");

        int i = args.length;
        if(i == 0)
            System.out.println("引数は0個です");
        else if(i % 2 == 0)
            System.out.println("引数の数は偶数です");
        else
            System.out.println("引数の数は奇数です");

        int i = (int)(Math.random() * 10);
        int amari = i % 3;
        switch (amari) {
            case 0: System.out.println("乱数" + i + "は3の倍数です");
                break;
            case 1: System.out.println("乱数" + i + "は3の倍数+1です");
                break;
            case 2: System.out.println("乱数" + i + "は3の倍数+2です");
                break;
            default:break;
        }

        char c = 'j';
        if(c == 'a') System.out.println("aです");
        else if (c == 'b') System.out.println("bです");
        else if (c == 'c') System.out.println("cです");
        else System.out.println("どれでもない");

        int i = (int)(Math.random() * 10);
        System.out.println(i);



        int i;
        for(i = 0; i < args.length; i++) {
            if(args[i].equals("skip")) continue;
            System.out.println("第" + (i+1) + "引数:" + args[i]);
            if(args[i].equals("end")) break;
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int i;
        for (i = 0; i < 5; i++)// for (変数初期化; 条件式; ループ処理)
            System.out.println(i);

        int i = 0;
        while (i < 5) {//       while条件式
            System.out.println(i);//    処理
            i++;
        }


        int i = 0;
        while (i < args.length) {
            System.out.println("第" + (i+1) + "引数:" + args[i]);
            i++;
        }

       int i;
       int j;

       LOOP1:
           for(j=0; j<10; j++) {
               System.out.print(j + ":");
               i = 0;
               while(i < 10) {
                   System.out.print(" " + i);
                   if(i*j > 20) { break LOOP1; }
                   i++;
               }
               System.out.print("¥n");
           }*/









