package constants;

/**
 * 定数を定める
 * @author Horita
 *
 */
public class Constants {

	/**
 	* メッセージを定義
 	* @author Horita
 	*
 	*/
	public enum Message {
	
		MESSAGE_001("\nタスクの登録を行います"),
		MESSAGE_002("\nステータスの更新を行います\nタスクIDを入力してください"),
		MESSAGE_003("\n確認したいタスクを選択してください\n1.全タスク一覧 2.未完了タスク 3.完了タスク"),
		MESSAGE_004("タスク名を入力してください"),
		MESSAGE_005("\nステータスを選択してください\n1.未着手 2.作業中 3.完了"),
		MESSAGE_006("\n機能を選択してください\n1.タスク登録 2.タスク確認 3.タスク更新 0.終了"),
		MESSAGE_007("\nタスク管理を終了します"),
		MESSAGE_008("\n該当のタスクがありません"),
		MESSAGE_009("\n全てのタスクを表示します"),
		MESSAGE_010("\n未完了のタスクを表示します"),
		MESSAGE_011("\n完了したタスクを表示します"),
		MESSAGE_012("該当のタスクはありません"),
		ERROR_MESSAGE_001("\n正しい番号を入力してください"),
		ERROR_MESSAGE_002("\n正しくタスクを入力してください");

	
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
	
}
