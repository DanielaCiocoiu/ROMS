package com.home.ROMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RomsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RomsApplication.class, args);
	}
/*
curl -X PATCH 'http://localhost:8080/payments/1/amount?amount=-10.0'


1. structurare clase din domeniu pe pachete (unde sunt 2 sau mai multe)
2. mutare a claselor de service si repository pentru o entitate in acelasi pachet si marcarea repositoryului cu modificatorul de acces default
3. structurarea requesturilor in postman

<prefix>/<task_id>-<descriere>
prefix = feature, refactor, fix
task_id = ABC-123
descriere = arbitrar: ex add-user

ex: feature/ROM-1-users  - fara ROM-1

*/
}
