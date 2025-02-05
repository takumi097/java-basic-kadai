package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public Scanner scanner = new Scanner(System.in);
		
		public String getMyChoice() {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String choice = scanner.nextLine();
			
			while ( !choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
				System.out.println("正しく入力してください");
				choice = scanner.nextLine();
				
			}
			return choice;
		}
		
		public String getRandom() {
			String[] opponentChoice = { "r", "s", "p"};
			int i = (int) (Math.floor(Math.random() * 3));
			return opponentChoice[ i ];
			
		}
		
		public void playGame() {
			HashMap<String, String> result = new HashMap<>();
			
			result.put( "r", "グー");
			result.put("s", "チョキ");
			result.put( "p", "パー");
			
			String mychoice = getMyChoice();
			String opponentChoice = getRandom();
			
			
			System.out.println("自分の手は" + result.get(mychoice) + ", 対戦相手の手は" + result.get(opponentChoice));
			
			if (mychoice.equals(opponentChoice)) {
				System.out.println("あいこです");
			}
			else if ((mychoice.equals("r") && opponentChoice.equals("s")) || (mychoice.equals("s") && opponentChoice.equals("p")) || (mychoice.equals("p") && opponentChoice.equals("r"))) {
				System.out.println("自分の勝ちです");
			}
			else {
				System.out.println("自分の負けです");
			}
			
		}
		
		
		
		

	

	}

