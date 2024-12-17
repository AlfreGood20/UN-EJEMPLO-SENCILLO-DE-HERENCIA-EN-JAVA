package herencia;

public class gallina extends animales{

	public gallina(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("La gallina hace 'Cocorocó'.");
	}
}