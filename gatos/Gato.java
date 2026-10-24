public  final class Gato extends Animal{
	//String nombre;
	//int edad;
	String raza;

	public Gato(String n,int e,String r) {
	    super(n, e);
	    // nombre = n;
	    // edad = e;
	    raza = r;
	}

	public Gato ( String r) {
		super();
		// nombre = n;
		// edad = 0;
		raza = r;
   }
	public void maullar () {
	System.out.println("Miau!");
  }
	public void ronronear () {
	System.out.println("Prrrrrrrr");
 }

 	@Override 
	public void reaccionAAcaricia() {
		System.out.println("oh me acariciaron!!");
		ronronear();
	}

	public static void main(String[] args){
	Gato A = new Gato("DonGato",3,"Siames" );
	System.out.println(A.getNombre());
	System.out.println(A.getEdad());
	System.out.println(A.raza);
	A.setNombre("Felix");
	System.out.println(A.getNombre());
	System.out.println(A.getEdad());
	System.out.println(A.raza);
	A.maullar();
	//A.ronronear();
	System.out.println("Vamos a acariciar al gato");
	A.reaccionAAcaricia();

//--------------------------------------------------

	Gato B = new Gato("Bombay" );
	System.out.println(B.getNombre());
    System.out.println(B.getEdad());
    System.out.println(B.raza);
    B.maullar();
	//B.ronronear();
	System.out.println("Vamos a acariciar al gato");
	B.reaccionAAcaricia();

//-------------------------------------------------
	// Gato C = new Gato("Luna",15,"Maine Coon");
	// System.out.println(C.getNombre());
	// System.out.println(C.getEdad());
	// System.out.println(C.raza);
	// C.maullar();
	// C.ronronear();
  }
}

