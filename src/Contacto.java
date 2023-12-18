public class Contacto{
    public static int id = 1;
    private final int idObjeto;
    private String nombre, telefono;

    public Contacto(String nombre, String telefono){
        this.idObjeto = id;
        id++;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre){
        this.idObjeto = id;
        id++;
        this.nombre = nombre;
        this.telefono = "0";
    }

    public int getIdObjeto() {
        return idObjeto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean esIgual(String nombre){
        boolean esIgual;
        if(this.nombre.equals(nombre)){
            esIgual = true;
        } else{
            esIgual = false;
        }
        return esIgual;
    }

    public void imprimirDatos(){
        System.out.println("ID: " + this.idObjeto + "\nNombre: " + this.nombre + "\nTeléfono: " + this.telefono);
    }
}