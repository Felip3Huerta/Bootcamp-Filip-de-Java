public class Gato {
	String nombre;
	int edad;
	String raza;

	public Gato(String n,int e,String r) {
	nombre = n;
	edad = e;
	raza = r;
    }

	public Gato (String n, String r) {
 	nombre = n;
	edad = 0;
	raza = r;
   }
	public void maullar () {
	System.out.println("Miau!");
  }
	public void ronronear () {
	System.out.println("Prrrrrrrr");
 }

	public static void main(String[] args){
	Gato A = new Gato("DonGato",3,"Siames" );
	System.out.println(A.nombre);
	System.out.println(A.edad);
	System.out.println(A.raza);
	A.maullar();
	A.ronronear();
	Gato B = new Gato("Mirai", "Bombay" );
	System.out.println(B.nombre);
        System.out.println(B.edad);
        System.out.println(B.raza);
        B.maullar();
	B.ronronear();
	Gato C = new Gato("Luna",15,"Maine Coon");
	System.out.println(C.nombre);
	System.out.println(C.edad);
	System.out.println(C.raza);
	C.maullar();
	C.ronronear();
  }
}

