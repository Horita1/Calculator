package service;

import java.io.IOException;

import constans.Message;
import validation.ValidateException;
import validation.ValidationCheck;

/**
 * 税込み価格の計算を行う
 * @author Horita
 *
 */
public class IncludingTaxService implements IService {
	
	/**
	 * 税込み計算の入力を行う
	 */
	public void execute() throws IOException {
		
		// 入力用のオブジェクトを生成
		InputService inputService = new InputService();
		// 入力チェック用オブジェクトの生成
		ValidationCheck validationCheck = new ValidationCheck();
		
		// 入力用初期化
		int num1;
		int num2;
		
		System.out.println("\n税込み計算を行います");
		
		while(true) {
			
			try {
		
				// 最初の値を入力する
				System.out.println(Message.INPUT_EXCLUDING_TAX.getMessage());
				num1 = inputService.InputNum();
				// 入力値がマイナスかチェック
				validationCheck.minusCheck(num1);
		
				// 二回目の値を入力する
				System.out.println(Message.INPUT_TAX_RATE.getMessage());
				num2 = inputService.InputNum();
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
	 * @param num1 最初の入力値
	 * @param num2　2回目の入力値
	 * @throws IOException
	 */
	public void show(int num1, int num2) throws IOException {		
		// 合計を計算する
		int total = num1 + num1 * num2 / 100;
		System.out.println(Message.OUTPUT_CALCULATION_RESULTS.getMessage());
		System.out.println("税抜価格" + num1 + "の税率" + num2 + "%は、税込み" + total );
	}
	
}
