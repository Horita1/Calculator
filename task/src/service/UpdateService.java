package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import entity.TaskData;
import validation.ValidateException;

/**
 * 更新を行う
 * @author Horita
 *
 */
public class UpdateService implements IService {

	/**
	 * タスクIDをもとにステータスの更新を行う
	 * @throws ValidateException 
	 */
	public List<TaskData> execute(List<TaskData> taskDataList) throws IOException, ValidateException {
		
		// 文字入力用		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println(Constants.Message.MESSAGE_002.getMessage());
		// IDの入力を行う
		String id = br.readLine();
		// 対象のタスクがあったか判定用
		String status = null;
		
		// 入力されたIDのタスクがあるか確認し、あった際はステータスの更新を行う
		for(TaskData taskData : taskDataList) {
			
			if(id.equals(Integer.toString(taskData.getId()))) {

				// タスク更新用のオブジェクトを生成
				AdditionService additionService = new AdditionService();
				// ステータスの入力を行う
				status = additionService.inputStatus();
				// ステータスの更新を行う
				taskData.setStatus(status);
				System.out.println("ID:" + id + " タスク名:" + taskData.getId() + " のステータスを["+ status + "]に更新しました");
			}
			
		}
		
		// 入力したIDが登録されていない場合表示する
		if(status == null) {
			System.out.println(Constants.Message.MESSAGE_008.getMessage());
		}
	
		return taskDataList;
		
	}
	
}
