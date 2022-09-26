package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.TaskData;
import service.InputService;
import validation.ValidateException;

/**
 * サービスの流れを定義する
 * @author Horita
 *
 */
public class SarviceController {

	/**
	 * タスクリストを生成し、処理を実行する 
	 * @param args
	 * @throws IOException
	 * @throws ValidateException
	 */
	public static void main(String[] args) throws IOException, ValidateException {

		// タスクを格納するリストを生成
		List<TaskData> taskDataList = new ArrayList<>();
		
		// タスク管理機能を実行
		InputService inputService = new InputService();
		inputService.SelectService(taskDataList);
		
	}
	

}
