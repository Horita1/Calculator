package constants;

import validation.ValidateException;

/**
 * 一覧表示用の定数を定義
 * @author Horita
 *
 */
public enum ConfitmEnum {

	ALL("1", "全てのタスク" ),
	INCOMPLETE("2", "未完了タスク"),
	COMPLETION("3", "完了タスク");
	
	private final String id;
	private final String confitm;

	private ConfitmEnum(String id, String confitm) {
		this.id = id;
		this.confitm = confitm;
	}
	
	/**
	 * IDを取得する
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	public String getConfitm() {
		return confitm;
	}
	
	
	/**
	 * 入力値と一致するIDがあった場合、定数を返す
	 * @param id
	 * @return
	 * @throws ValidateException
	 */
	public static ConfitmEnum getConfitmById(String id) throws ValidateException {
		for (ConfitmEnum confitmEnum : ConfitmEnum.values()) {
			
			if(confitmEnum.getId().equals(id)) {
				return confitmEnum;
			}
			
		}
		
		throw new ValidateException(Constants.Message.ERROR_MESSAGE_001.getMessage());
	}


	
}
