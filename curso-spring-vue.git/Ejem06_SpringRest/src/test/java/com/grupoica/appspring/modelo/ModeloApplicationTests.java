package com.grupoica.appspring.modelo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.grupoica.appspring.modelo.daos.HeroesDAO;
import com.grupoica.appspring.modelo.entidades.Heroe;

//@SpringBootTest
@DataJpaTest
class ModeloApplicationTests {
	
	///Inyeccion de dependencias: Spring se encarga de hacer new
	// y asignarnos el valor a esta variable miembro.
	@Autowired
	HeroesDAO heroesDAO;
	
	@Test
	void contextLoads() {
		Heroe ironMan = new Heroe();
		ironMan.setNombre("Iron Man");
		Heroe superMan = new Heroe();
		superMan.setNombre("SuperMan");
		Heroe flaman = new Heroe();
		flaman.setNombre("Flaman");
		heroesDAO.save(ironMan);
		heroesDAO.save(superMan);
		heroesDAO.save(flaman);
		
		System.out.println(heroesDAO.findAll().get(0).getNombre());
		//assertThat(heroesDAO.findAll().get(1).getNombre()).isEqualTo("Superman");
	}
	

}
