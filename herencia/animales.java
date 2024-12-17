package herencia;

public class animales {
	
	private String nombre;
	private int edad;

	public animales(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void hacerSonido() {
		System.out.println("El animal hace un sonido.");
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años.");
	}
}