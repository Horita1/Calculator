package controller;

import java.io.IOException;

import service.IService;
import service.InputService;

public class ServiceController {

	public static void main(String[] args) throws IOException {

		InputService inputService = new InputService();
		IService iservice = inputService.selectService();
		
		iservice.execute();
		
	}

}
