package cl.aiep.java.cft;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Alumno {
	
	@Size(min = 3, max= 20)
	private String nombre;
	@Min(value = 18, message = "Debe ser mayor de edad.")
	private int edad;
	
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Alumno() {
		super();
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
	
	
	
}


