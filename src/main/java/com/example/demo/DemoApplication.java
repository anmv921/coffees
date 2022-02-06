package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Entity
class Coffee {
	@Id
	private String id;
	private String name;

	public Coffee() {}

	public Coffee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Coffee(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}
}