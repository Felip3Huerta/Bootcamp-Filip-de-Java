
public final class Pajaro extends Animal {
	//String nombre; 
	//int edad;
	String especie;
	
	public Pajaro (String n, int e,String esp) {
	//nombre = n;
	//edad = e;
	super(n, e);
	especie = esp;
      }
	public Pajaro (String n, String esp){
	//nombre = n;
	//edad = 0;
	super(n, 0);
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
	System.out.println(A.getNombre());
	System.out.println(A.getEdad());
	System.out.println(A.especie);
	A.cantar();
	A.alimentar();
	Pajaro B = new Pajaro("Pidgeot", 5, "Pokemon");
	System.out.println(B.getNombre());
	System.out.println(B.getEdad());
	System.out.println(B.especie);
	B.alimentar();
	Pajaro C = new Pajaro("BlueBird", "Canario");
	System.out.println(C.getNombre());
	System.out.println(C.getEdad());
	System.out.println(C.especie);
	C.cantar();
	C.alimentar();
  }

}
