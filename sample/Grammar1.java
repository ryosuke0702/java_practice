package sample;

public class Grammar1 {

    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 入力パラメータを読み込む
        //String input = br.readLine();
        //String[] param = input.split(" ");
        System.out.println("引数は" + args.length + "個指定されています");
        int i = 0;
        for (i = 0; i < args.length; i++) {
            System.out.println((i + 1) + "番目の引数は「" + args[i] + "」です");
        }
    }
}
