package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.ConfitmEnum;
import constants.Constants;
import entity.TaskData;
import validation.ValidateException;

/**
 * タスク一覧表示用
 * @author Horita
 *
 */
public class ConfirmService implements IService {

	
	/**
	 * 選択されたタスクを表示する
	 * @throws ValidateException 
	 */
	public List<TaskData> execute(List<TaskData> taskDataList) throws IOException, ValidateException {
		
		// 文字入力用		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		while(true) {
		
			try {
		
				System.out.println(Constants.Message.MESSAGE_003.getMessage());
				// タスクのステータスを入力する
				ConfitmEnum confitmEnum = ConfitmEnum.getConfitmById(br.readLine());
					
				switch(confitmEnum) {
				case ALL:        // 全て 
					showAll(taskDataList);
					break;
				case INCOMPLETE: // 未完了
					showIncomplete(taskDataList);
					break;
				case COMPLETION: // 完了
					showCompletion(taskDataList);
					break;
				}
		
				return taskDataList;
		
			}catch(ValidateException e) {
				System.out.println(e.getMessage());
			}
		
		}

	}
	
	/**
	 * 全て表示する
	 * @param taskDataList
	 */
	private void showAll(List<TaskData> taskDataList) {
		
		// 該当タスクがあるか判定用
		boolean check = true;
		
		System.out.println(Constants.Message.MESSAGE_009.getMessage());
		// 全てのタスクを表示する
		for(TaskData taskData : taskDataList) {
			System.out.println(taskData);
			check = false;
		}
		
		// 該当のタスクがない場合に、該当がないと表示する
		if(check) {
			System.out.println(Constants.Message.MESSAGE_012.getMessage());
		}
		
	}
	
	/**
	 * 未完了を表示する
	 * @param taskDataList
	 */
	private void showIncomplete(List<TaskData> taskDataList) {
		
		// 該当タスクがあるか判定用
		boolean check = true;
		
		System.out.println(Constants.Message.MESSAGE_010.getMessage());
		//ステータスが【完了】以外を表示する
		for(TaskData taskData : taskDataList) {
			
			if(!(taskData.getStatus().equals("完了"))) {
			System.out.println(taskData);
			check = false;
			}
	
		}
		
		// 該当のタスクがない場合に、該当がないと表示する
		if(check) {
			System.out.println(Constants.Message.MESSAGE_012.getMessage());
		}

	}
	
	/**
	 * 完了を表示する
	 * @param taskDataList
	 */
	private void showCompletion(List<TaskData> taskDataList) {
		
		// 該当タスクがあるか判定用
		boolean check = true;
		
		System.out.println(Constants.Message.MESSAGE_011.getMessage());
		// ステータスが【完了】のものを表示する
		for(TaskData taskData : taskDataList) {
			
			if(taskData.getStatus().equals("完了")) {
			System.out.println(taskData);
			check = false;
			}
	
		}
		
		// 該当のタスクがない場合に、該当がないと表示する
		if(check) {
			System.out.println(Constants.Message.MESSAGE_012.getMessage());
		}

	}
		
}
