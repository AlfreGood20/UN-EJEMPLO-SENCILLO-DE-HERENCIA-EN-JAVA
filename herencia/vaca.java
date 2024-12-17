package herencia;

public class vaca extends animales {

	public vaca(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void hacerSonido() {
	   System.out.println("La vaca hace 'Muuuu'.");
	}
}