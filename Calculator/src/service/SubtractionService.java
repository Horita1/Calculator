package service;

import java.io.IOException;

import constans.Message;

/**
 * 引き算を行う
 * @author Horita
 *
 */
public class SubtractionService implements IService {
	
	
	/**
	 * 引き算の入力を行う
	 */
	public void execute() throws IOException {
		
		// 入力用のオブジェクトを生成
		InputService inputService = new InputService();
		
		System.out.println("\n引き算を行います");
		
		// 最初の値を入力する
		System.out.println(Message.INPUT_FIRST_NUM.getMessage());
		int num1 = inputService.InputNum();
		
		// 二回目の値を入力する
		System.out.println(Message.INPUT_SECOND_NUM.getMessage());
		int num2 = inputService.InputNum();
		//結果を表示する
		show(num1, num2);
	}
	
	/**
	 * 計算結果を表示する
	 * @param num1　最初の入力値
	 * @param num2　2回目の入力値
	 * @throws IOException
	 */
	public void show(int num1, int num2) throws IOException {
		// 合計を計算する
		int total = num1 - num2;
		System.out.println(Message.OUTPUT_CALCULATION_RESULTS.getMessage());
		System.out.println(num1 + " - " + num2 + " = " + total );
	}
	

}
