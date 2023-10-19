package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// com esta classe é um componente que será usado para fazer requisições HTTP a outros serviços.

@Configuration //Esta é uma anotação do Spring que indica que a classe AppConfig é uma classe de configuração
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/*
		 Este método é anotado com @Bean, o que significa que ele é um método que define um bean gerenciado pelo Spring. 
		 O método cria uma instância da classe RestTemplate e a retorna. 
		 
		 Um RestTemplate é uma classe do Spring usada para fazer chamadas HTTP a serviços externos. 
		 Neste caso, a instância de RestTemplate é configurada e gerenciada pelo Spring e pode ser injetada em outras partes da aplicação onde 
		 for necessário para realizar chamadas a serviços externos.
	
		 O propósito geral deste código é configurar um RestTemplate, que será utilizado para a comunicação com outros serviços externos em uma aplicação Spring. 
		 Isso é especialmente útil em cenários de microserviços, onde a aplicação precisa se comunicar com outros serviços para buscar ou enviar dados.
		 
		 A anotação @Bean é usada para marcar um método em uma classe de configuração que produz um objeto que será gerenciado pelo Spring. 
		 Quando o Spring inicializa o contexto da aplicação, ele chama os métodos anotados com @Bean para criar esses objetos e os coloca no contexto de aplicação. 
		 Esses objetos ficam disponíveis para serem injetados em outras partes da aplicação onde são necessários.

		 O azmétodo restTemplate() é anotado com @Bean, o que significa que ele é responsável por criar uma instância da classe RestTemplate. 
		 Quando a aplicação é iniciada, o Spring chama este método, cria a instância do RestTemplate e a disponibiliza para outras partes da aplicação. 
		 Isso é útil para que outros componentes ou serviços possam injetar e usar essa instância de RestTemplate para fazer chamadas HTTP a outros serviços.

		 Resumindo, o @Bean é usado para definir objetos gerenciados pelo Spring, permitindo que você configure e crie esses objetos de forma centralizada, tornando-os disponíveis para injeção em outras partes da aplicação.
	  */
}
