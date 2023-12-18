public class Agenda {
    private Contacto[] listaContactos;

    public Agenda(){
        listaContactos = new Contacto[100];
    }
    public Agenda(int numContactos){
        listaContactos = new Contacto[numContactos];
    }

    public boolean existeContacto(String nombre){
        boolean existe = false;
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] != null && listaContactos[i].esIgual(nombre)){
                existe = true;
            }
        }
        return existe;
    }
    public int siguienteHuecoLibre(){
        int posicion = -1;
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] == null){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    public int numHuecosLibres(){
        int conteo = 0;
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] == null){
                conteo++;
            }
        }
        return conteo;
    }
    public void addContacto(Contacto contacto){
        if(numHuecosLibres() > 0){
            listaContactos[siguienteHuecoLibre()] = contacto;
        }
    }
    public Contacto buscarContacto(String nombre){
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] != null && listaContactos[i].esIgual(nombre)){
                return listaContactos[i];
            }
        }
        return null;
    }
    public void eliminarContacto(String nombre){
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] != null && listaContactos[i].esIgual(nombre)){
                listaContactos[i] = null;
            }
        }
    }
    public void imprimirContacto(String nombre){
        for (int i = 0; i < listaContactos.length; i++) {
            if(listaContactos[i] != null && listaContactos[i].esIgual(nombre)){
                listaContactos[i].imprimirDatos();
            }
        }
    }
    public void listaContactos(){
        for (int i = 0; i < listaContactos.length; i++) {
            listaContactos[i].imprimirDatos();
        }
    }
}
