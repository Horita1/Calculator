package service;

import java.io.IOException;

import constans.Message;
import validation.ValidateException;
import validation.ValidationCheck;

public class BonusService implements IService {
	
	/**
	 * 賞与計算の基となる値の入力を行う
	 */
	public void execute() throws IOException {
		
		// 入力用のオブジェクトを生成
		InputService inputService = new InputService();
		// 入力チェック用オブジェクトの生成
		ValidationCheck validationCheck = new ValidationCheck();
				
				
		// 入力用初期化
		int num1;
		int num2;
				
		System.out.println("\n賞与計算を行います");
				
		// マイナスが入力されたら繰り返し入力を求める
		while(true) {
					
			try {
		
				// 最初の値を入力する
				System.out.println(Message.INPUT_MONTHLY_SALARY.getMessage());
				num1 = inputService.InputNum();
				// 入力値がマイナスかチェック
				validationCheck.minusCheck(num1);
						
				// 二回目の値を入力する
				System.out.println(Message.INPUT_MONTH_NUM.getMessage());
				// 入力値を確認し最大6カ月をnum2に代入
				num2 = maxMonth(inputService.InputNum());
				// 入力値がマイナスかチェック
				validationCheck.minusCheck(num2);
						
				break;
				} catch(ValidateException e) {
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
		int total = num1 * 2 * num2 / 6;
		System.out.println(Message.OUTPUT_CALCULATION_RESULTS.getMessage());
		System.out.println("基本給" + num1 + "在籍月数" + num2 + "カ月の賞与は" + total );
	}
	
	/**
	 * 在籍期間が6カ月を超えた場合、6カ月として値を返す
	 * @param value　入力値
	 * @return
	 */
	public int maxMonth (int value) {
		if (value >= 6) {
			value = 6;
		}
		
		return value;
		
	}
	

}
