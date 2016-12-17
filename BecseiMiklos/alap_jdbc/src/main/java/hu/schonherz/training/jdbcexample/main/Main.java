package hu.schonherz.training.jdbcexample.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import hu.schonherz.training.jdbcexample.data.dao.GenericDAO;
import hu.schonherz.training.jdbcexample.data.dto.ParticipantDTO;

@Configuration
@ComponentScan(basePackages = { "hu.schonherz.training.jdbcexample" })
public class Main {
	@Autowired
	private GenericDAO<ParticipantDTO> dao;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();		
		Main main = new Main();
		main.stuff();
	}
	public void stuff() {
		System.out.println(dao.findAll());
	}
}
