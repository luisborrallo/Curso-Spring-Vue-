package com.grupoica.appspring.modelo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoica.appspring.modelo.daos.HeroesDAO;
import com.grupoica.appspring.modelo.entidades.Heroe;

@RestController
@RequestMapping("/api/heroes")
@CrossOrigin
public class ControladorHeroes {
	
	@Autowired
	HeroesDAO heroesDAO;

	// @RequestMapping(method=RequestMethod.GET)
	@RequestMapping(method=RequestMethod.GET, value= "/prueba")
	public Heroe leerHeroe() {
		System.out.println(">>>>>> Petición recibida");
		Heroe heroe = new Heroe();
		heroe.setNombre("Hulk");
		
		return heroe; 
	} 
	@PostMapping
	public Heroe guardarHeroe(@RequestBody  Heroe nuevoHeroe) {
		System.out.println(">>>>>> Heroe recibido: " + nuevoHeroe.getNombre());
		return heroesDAO.save(nuevoHeroe);
	}
	@PutMapping
	public Heroe actualizar(@RequestBody  Heroe heroe) {
		if (heroe.getId() > 0) {
			System.out.println(">>>>>> Heroe recibido: " + heroe.getNombre());	
			return heroesDAO.save(heroe);
		} else {
			System.out.println(">>>>>> Heroe sin ID: " + heroe.getNombre());
			return null;
		}
	}
	@DeleteMapping
	public void borrar(@RequestBody  Heroe heroe) {
		if (heroe.getId() > 0) {	
			heroesDAO.delete(heroe);
		} else {
			System.out.println(">>>>>> Heroe sin ID: " + heroe.getNombre());
		}
	}
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void borrar(@PathVariable  int id) {
		if (id > 0) {	
			heroesDAO.deleteById(id);
		} else {
			System.out.println(">>>>>> Heroe sin ID: " + id);
		}
	}
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Heroe getUno(@PathVariable int id) {
		if (id > 0) {	
			return heroesDAO.findById(id).get();
		} else {
			System.out.println(">>>>>> Heroe sin ID: " + id);
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Heroe> getAll() {
		return heroesDAO.findAll();
	}
}
