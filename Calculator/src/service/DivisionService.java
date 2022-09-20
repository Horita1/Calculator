package service;

import java.io.IOException;

import constans.Message;
import constans.ValidationMessage;
import validation.ValidateException;

public class DivisionService implements IService {
	
	/**
	 * 割り算の入力を行う
	 */
	public void execute() throws IOException {
		
		// 入力用のオブジェクトを生成
		InputService inputService = new InputService();
		
		// 入力用
		int num1;
		int num2;
		
		System.out.println("\n割り算を行います");
		
		// 0が入力された場合、繰返し入力を行う
		while(true) {
		
			try {
				// 最初の値を入力する
				System.out.println(Message.INPUT_FIRST_NUM.getMessage());
				num1 = inputService.InputNum();
				// 0が入力されたか確認
				zeroCheck(num1);
		
				// 二回目の値を入力する
				System.out.println(Message.INPUT_SECOND_NUM.getMessage());
				num2 = inputService.InputNum();
				// 0が入力されたか確認
				zeroCheck(num2);
				
				break;
			} catch (ValidateException e) {
				System.out.println(e.getMessage());
			}
			
		}
		//結果を表示する
		show(num1, num2);
	}
	
	/**
	 * 計算結果を表示する
	 * @param num1
	 * @param num2
	 * @throws IOException
	 */
	public void show(int num1, int num2) throws IOException {		
		// 合計を計算する
		int total = num1 / num2;
		System.out.println(Message.OUTPUT_CALCULATION_RESULTS.getMessage());
		System.out.println(num1 + " ÷ " + num2 + " = " + total );
	}
	
	/**
	 * 入力された値が0か確認
	 * @param 入力値
	 * @throws ValidateException
	 */
	public void zeroCheck(int value) throws ValidateException {
		if((value == 0 )) {
            throw new ValidateException(ValidationMessage.VALIDATION_ZERO_INPUT.getMessage());
        }
	}

}
