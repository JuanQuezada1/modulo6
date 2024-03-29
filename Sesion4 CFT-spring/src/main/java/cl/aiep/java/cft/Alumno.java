package cl.aiep.java.cft;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Alumno {
 
	@Min(0)
	private int id;
	
	
	@Size(min = 3, max = 20)
	private String nombre;
	

	@Min(value = 18, message = "Debe ser mayor de edad")
	private int edad;
		
	public Alumno() {	
	}
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Alumno(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
