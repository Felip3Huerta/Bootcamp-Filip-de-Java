public class Animal{
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
	this.nombre = nombre;
	this.edad = edad;
    }

    public Animal(){
        this.nombre = "Gato Dummy";
        this.edad = 5;
    }

    public String getNombre(){
        int v = 4+2;
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public int getEdad(){
        int v = 4+2;
        return edad;
    }

    public void setEdad( int nuevaEdad){
        this.edad = nuevaEdad;
    }

    public void reaccionAAcaricia(){
        System.out.println("Huye");
    }
    
    
}
