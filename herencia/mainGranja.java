package herencia;

public class mainGranja {

	public static void main(String[] args) {
		
		vaca vaca=new vaca("Vaca blanca",4);
		perro perro=new perro("Maltes",6);
		gallina gallina=new gallina("Cola larga",1);
		
		granja granja=new granja();
		
		granja.añadirAnimal(vaca);
		granja.añadirAnimal(gallina);
		granja.añadirAnimal(perro);
		
		granja.mostrarInfo();
		System.out.println("*************************");
		granja.hacerSonidos();
	}
}