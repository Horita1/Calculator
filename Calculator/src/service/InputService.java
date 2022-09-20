package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import constans.Message;
import constans.ValidationMessage;
import validation.ValidateException;
import validation.ValidationCheck;


/**
 * 入力を行う
 * @author Horita
 */
public class InputService {
	
	/**
	 * 機能選択を行う
	 * @return
	 */
	public IService selectService() throws IOException {
		// 文字入力用		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		IService iService;
		
		while(true) {
			try {
		
				System.out.println(Message.SELECT_MENU_NUM.getMessage());
				// 機能番号を入力する
				String functionNum = br.readLine();
				// 入力値の確認
				selectCheck(functionNum);
				
				// 入力内容をもとに機能を取得する
				ServiceFactory serviceFactory = new ServiceFactory();
				iService = serviceFactory.create(functionNum);
		
				break;
			}catch (ValidateException e) {
				System.out.println(e.getMessage());
			}
		
		}
		
		return iService;
		
	}
	
	/**
	 * 計算のもととなる値を入力する
	 * @return 入力した値
	 */
	public int InputNum() throws IOException {
		// 文字入力用
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 入力チェック用オブジェクトの生成
		ValidationCheck validationCheck = new ValidationCheck();
		
		int num;
		
		// 数字が入力されるまで入力を繰り返す
		while(true) {
			try {
				String value = br.readLine();
				validationCheck.numCheck(value);
				num = Integer.parseInt(value);
	
				break;
			}catch (ValidateException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		return num;
	}
	
	/**
	 * 機能選択番号が設定されている番号か確認
	 * @param 機能選択番号
	 * @throws ValidateException
	 */
	public void selectCheck(String value) throws ValidateException {
		if(!Arrays.asList("1", "2", "3", "4", "5", "6").contains(value)) {
            throw new ValidateException(ValidationMessage.VALIDATION_SELECT_NUM.getMessage());
        }
	}
	

}
