package practice;

import java.util.Random;
//import java.util.Random;

public class PracticeSwitch {

	public static void main(String[] args) {

		int num[] = new int[10];//10個の配列を定義
		Random rnd = new Random(); //Randomクラスを呼び出し		
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(5);
			int jobNum = num[i] + 1; //配列のインデックス番号が1〜5で表示されるようにする

			String jobArray[] = { //職業の配列を定義
					"勇者",
					"バトルマスター",
					"パラディン",
					"海賊",
					"魔法剣士"
			};
			switch (jobNum) { //resultの値が下記caseの場合それぞれの処理
			case 1:
				System.out.println(jobNum + ":" + jobArray[0]);
				break;
			case 2:
				System.out.println(jobNum + ":" + jobArray[1]);
				break;
			case 3:
				System.out.println(jobNum + ":" + jobArray[2]);
				break;
			case 4:
				System.out.println(jobNum + ":" + jobArray[3]);
				break;
			case 5:
				System.out.println(jobNum + ":" + jobArray[4]);
				break;
			}

		}

	}
}
