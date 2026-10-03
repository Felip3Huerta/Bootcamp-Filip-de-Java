
public class Pajaro {
	String nombre; 
	int edad;
	String especie;
	
	public Pajaro (String n, int e,String esp) {
	nombre = n;
	edad = e;
	especie = esp;
      }
	public Pajaro (String n, String esp){
	nombre = n;
	edad = 0;
	especie = esp;

    }
	public void cantar (){
	System.out.println ("Pio Pio!");
  }
	public void alimentar (){
	System.out.println("Alimentaste al pajarito!");
}
	public static void main(String[] args){
	
	Pajaro A = new Pajaro("Piolin", 3, "Canario");
	System.out.println(A.nombre);
	System.out.println(A.edad);
	System.out.println(A.especie);
	A.cantar();
	A.alimentar();
	Pajaro B = new Pajaro("Pidgeot", 5, "Pokemon");
	System.out.println(B.nombre);
	System.out.println(B.edad);
	System.out.println(B.especie);
	B.alimentar();
	Pajaro C = new Pajaro("BlueBird", "Canario");
	System.out.println(C.nombre);
	System.out.println(C.edad);
	System.out.println(C.especie);
	C.cantar();
	C.alimentar();
  }

}
