package com.mosa.gestions;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mosa.gestions.entities.Reclamation;
import com.mosa.gestions.service.RecService;

@SpringBootApplication
public class GestionsApplication implements CommandLineRunner {

public static void main(String[] args) {
SpringApplication.run(GestionsApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
	//recService.saveReclamation(new Reclamation("mm","mm","mm","mm","mm","mm","mm", new Date()));
	//recService.saveReclamation(new Reclamation("oo","oo","oo","oo","oo","oo","oo", new Date()));
	//recService.saveReclamation(new Reclamation("ss","ss","ss","ss","ss","ss","ss", new Date()));
	}
}
