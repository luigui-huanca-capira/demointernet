package com.example.demointernet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestEstudiante {

	@GetMapping("/consultar")
	public List<Estudiante> consultar() {
		List<Estudiante> lst = new ArrayList<Estudiante>();
		for (int i = 1; i <=10; i++) {
			Estudiante e = new Estudiante();
			e.setId(i);
			e.setNombre("Estudiante "+i);
			lst.add(e);
		}
		return lst;
	}
	
	@PostMapping("/registrar")
	public Estudiante registrar(@RequestBody Estudiante nuevo) {
		nuevo.setNombre(nuevo.getNombre()+" registrado");
		return nuevo;
	}
}
