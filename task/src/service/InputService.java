package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import constants.Constants;
import entity.TaskData;
import validation.ValidateException;

/**
 * サービスの選択を行う
 * @author Horita
 *
 */
public class InputService {

	/**
	 * 入力された値をもとに処理を実行する
	 * @param taskDataList
	 * @throws IOException
	 */
	public void SelectService(List<TaskData> taskDataList) throws IOException,ValidateException {
		
		// 文字入力用		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		// 処理終了が選択されるまで、タスク管理機能を実行する
		while(true) {
		
			System.out.println(Constants.Message.MESSAGE_006.getMessage());
			// 機能選択番号を入力する
			String functionNum = br.readLine();
		
			// 処理終了が選択された際に、処理を終了する
			if(closeCheck(functionNum)) {
				System.out.println(Constants.Message.MESSAGE_007.getMessage());
				break;
			}
		
			try {
				//　選択された機能を生成する
				ServiceFactory servicefactory = new ServiceFactory();
				Optional<IService> service = servicefactory.create(functionNum);
				IService iService = service.orElseThrow();
		
				// 選択された機能を実行する
				taskDataList = iService.execute(taskDataList);
				
			}catch (NoSuchElementException e) {
				System.out.println(Constants.Message.ERROR_MESSAGE_001.getMessage());
			}
			
		}
		
	}
	
	
	/**
	 * 処理終了の値が入力されたか確認
	 * @param functionNum
	 * @return
	 */
	private boolean closeCheck(String functionNum) {
		if (functionNum.equals("0")) {
			return true;
		} else {
			return false;
		}
	}
	
}
