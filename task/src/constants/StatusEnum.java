package constants;

import validation.ValidateException;

/**
 * ステータス管理用のEnum
 * @author Horita
 *
 */
public enum StatusEnum {
	
	NOT_STARTED("1", "未着手"),
	WORKING("2", "作業中"),
	COMPLETION("3", "完了");
	
	private final String id;
	private final String status;

	private StatusEnum(String id, String status) {
		this.id = id;
		this.status = status;
	}
	
	/**
	 * IDを取得する
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * ステータスを取得する
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * 入力値と一致するIDがあった場合、定数を返す
	 * @param id
	 * @return
	 * @throws ValidateException 
	 */
	public static StatusEnum getStatusById(String id) throws ValidateException {
		for (StatusEnum statusEnum : StatusEnum.values()) {
			
			if(statusEnum.getId().equals(id)) {
				return statusEnum;
			}
			
		}
		
		throw new ValidateException(Constants.Message.ERROR_MESSAGE_001.getMessage());
	}


}
