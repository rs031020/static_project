package practice;

import java.util.Random;

public class PracticeSwitch {

	public static void main(String[] args) {

		int[] num = new int[10]; //10個の配列を定義
		Random rnd = new Random(); //Randomクラスを呼び出し		

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(4); //0〜4までを取得
		}
		
		String jobArray[] = { //職業の配列を定義
		"1:勇者",
		"2:バトルマスター",
		"3:パラディン",
		"4:海賊",
		"5:魔法剣士"
		};
		
		for (int result : num) { //num配列10個を繰り返す
			switch (result) { //resultの値が下記caseの場合それぞれの処理
			case 0:
				System.out.println(jobArray[0]);
				break;
			case 1:
				System.out.println(jobArray[1]);
				break;
			case 2:
				System.out.println(jobArray[2]);
				break;
			case 3:
				System.out.println(jobArray[3]);
				break;
			case 4:
				System.out.println(jobArray[4]);
				break;
			}

		}

	}
}
