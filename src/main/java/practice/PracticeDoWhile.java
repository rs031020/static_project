package practice;

public class PracticeDoWhile {

	public static void main(String[] args) {
		int num = 100; //初期値

		do {
			System.out.println(num); //変数numを出力
			num--; //numから1ずつ引く
		} while (num >= 0); //numが0になるまで繰り返し処理

	}
}
