package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 選択番号の機能を呼び出す
 * @author Horita
 */
public class ServiceFactory {

	/**
	 * 選択された機能を返す
	 * @param functionNum
	 * @return 選択された機能
	 */
	public Optional<IService> create(String functionNum) {
		
		Map<String, IService> serviceMap = new HashMap<>();
		serviceMap.put("1", new AdditionService());	// 登録機能
		serviceMap.put("2", new ConfirmService());	// タスク一覧確認機能
		serviceMap.put("3", new UpdateService());	// タスク更新機能
		
		IService service = serviceMap.get(functionNum);
		return Optional.ofNullable(service);
	}
	
}
