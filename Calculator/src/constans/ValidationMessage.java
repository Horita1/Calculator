package constans;

public enum ValidationMessage {

	VALIDATION_SELECT_NUM("\n正しい番号を入力してください"),
	VALIDATION_MINUS_NUM("\nマイナスの値は入力できません\n正の数字を入力してください"),
	VALIDATION_NUM_INPUT("\n整数を入力してください"),
	VALIDATION_ZERO_INPUT("\n0は入力できません");
	
	private String message;
	
	private ValidationMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
