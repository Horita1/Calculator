package constans;

/*
 * メッセージを定義
 */
public enum Message {
	
	SELECT_MENU_NUM("該当の機能の番号を入力してください\n1.足し算 2.引き算 3.掛け算 4.割り算 5.税込み計算 6.賞与計算"),
	INPUT_FIRST_NUM("最初の値を入力してください"),
	INPUT_SECOND_NUM("\n次の値を入力してください"),
	INPUT_EXCLUDING_TAX("税抜き価格を入力してください"),
	INPUT_TAX_RATE("\n消費税率を入力してください"),
	INPUT_MONTHLY_SALARY("基本給を入力してください"),
	INPUT_MONTH_NUM("\n在籍月数を入力してください"),
	OUTPUT_CALCULATION_RESULTS("\n結果を表示します");
	
	private String message;
	
	/**
	 * 進行メッセージを初期化
	 * @param message
	 */
	private Message(String message) {
		this.message = message;
	}
	
	/**
	 * 進行メッセージを取得する
	 */
	public String getMessage() {
		return this.message;
	}
	
}
