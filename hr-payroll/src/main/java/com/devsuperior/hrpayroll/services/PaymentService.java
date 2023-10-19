package com.devsuperior.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
//import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
//	@Autowired
//	private WorkerFeignClient workerFeignClient;
	
	@Value("${hr-worker.host}") // está pegando os dados criados no application.properties com esta linha: hr-worker.host=http://localhost:8001
	private String workerHost; // agora a informação http://localhost:8001 será jogada nesta variável 'workerHost'
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(long workerId, int days) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);  //""+workerId foi uma forma de transformar este dado em uma string
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables );
				
//		Worker worker = workerFeignClient.findById(workerId).getBody();
//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
