package herencia;
import java.util.*;

public class granja {
	ArrayList<animales> animales=new ArrayList<>();
	
	public void añadirAnimal(animales animal) {
		animales.add(animal);
	}
	
	public void hacerSonidos() {
		for(animales animal:animales) {
			animal.hacerSonido();
		}
	}
	public void mostrarInfo() {
        for (animales animal : animales) {
            animal.mostrarInfo();
        }
    }
}
