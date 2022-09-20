package validation;

import constans.ValidationMessage;

/**
 * 例外処理
 * @author Horita
 */
public class ValidationCheck {
	
	/**
	 * 入力された値が数字か確認
	 * @param 入力値
	 * @throws ValidateException
	 */
	public void numCheck(String value) throws ValidateException {
		if(!(value.matches("^[0-9]+$|-[0-9]+$"))) {
            throw new ValidateException(ValidationMessage.VALIDATION_NUM_INPUT.getMessage());
        }
		
	}
	
	/**
	 * 入力された番号がマイナスか確認
	 * @param 入力値
	 * @throws ValidateException
	 */
	public void minusCheck(int value) throws ValidateException {
		if((value < 0 )) {
            throw new ValidateException(ValidationMessage.VALIDATION_MINUS_NUM.getMessage());
        }
	}
	
	
}
