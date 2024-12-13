package janken;

import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
        String[] str = {"グー", "チョキ", "パー"};
        String line;
        
        System.out.println("じゃんけん小僧が勝負をしかけてきた。\nじゃんけん小僧「勝負だ！」");

        while (true) {
            // ユーザーの手を入力
            System.out.println("「どの手を出すんだ？打ってみな」 ");
            //標準入力を取得(キーボード入力)
            line = scanner.nextLine();
            
            // じゃんけん小僧の手をランダムに選ぶ
            int num = (int) (Math.random() * str.length);
           //乱数をnumへ代入
            String computerChoice = str[num];
            System.out.println("じゃんけん小僧 " + "「"+computerChoice+ "」");
            
            // 勝敗の判定
            if (line.equals("グー") && computerChoice.equals("チョキ")) {
                System.out.println("「負けた・・・あんたの勝ちだよ」");
                
            } else if (line.equals("チョキ") && computerChoice.equals("パー")) {
                System.out.println("「強いな・・・あんた」");
               
            } else if (line.equals("パー") && computerChoice.equals("グー")) {
                System.out.println("「つ・・つおい。。。」");
                
            } else if (line.equals("チョキ") && computerChoice.equals("グー")) {
                System.out.println("「おらつよいだろ☆彡」");
                
            } else if (line.equals("グー") && computerChoice.equals("パー")) {
                System.out.println("「おらつよいだろ☆彡」");
                
            } else if (line.equals("パー") && computerChoice.equals("チョキ")) {
                System.out.println("「おらつよいだろ☆彡」");
                
            } else if (line.equals(computerChoice)) {
                System.out.println("「あいこだね もう一戦しようぜ」");
                // あいこの場合は再試合のため、ループを継続
                continue;
            }

            // 勝敗が決まった場合はループを終了
            break;
        }

        scanner.close();
    }

}
