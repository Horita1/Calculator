package service;

import java.util.HashMap;
import java.util.Map;

/*
 * 選択項目によって機能を呼び出す
 * @auther Horita
 */
public class ServiceFactory {

	/*
	 * 機能を選択する
	 * @param 機能選択番号
	 * @return 選択された機能
	 */
	public IService create(String functionNum) {
		Map<String, IService> serviceMap = new HashMap<>();
		serviceMap.put("1", new AdditionService());
		serviceMap.put("2", new SubtractionService());
		serviceMap.put("3", new MultiplicationService());
		serviceMap.put("4", new DivisionService());
		serviceMap.put("5", new IncludingTaxService());
		serviceMap.put("6", new BonusService());
		
		return serviceMap.get(functionNum);
		
	}
}
