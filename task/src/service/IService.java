package service;

import java.io.IOException;
import java.util.List;

import entity.TaskData;
import validation.ValidateException;

// サービス用のインターフェース
public interface IService {

	List<TaskData> execute(List<TaskData> taskDataList) throws IOException,ValidateException;
	
	
	
}
