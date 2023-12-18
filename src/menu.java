import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Menu: \n1 para añadir un contacto \n2 para comprobar si existe un contacto \n3 para mostrar el siguiente hueco libre \n4 para saber cuántos huecos libres quedan en la agenda \n5 para buscar un contacto en la agenda \n6 para eliminar un contacto de la agenda \n7 para imprimir todos los contactos guardados");
        int elegir = sc.nextInt();

        switch (elegir) {
            case 1:
                System.out.println("Escribe el nombre del contacto:");
                String nombre = sc.nextLine();
                System.out.println("Escribe el teléfono del contacto:");
                String telefono = sc.nextLine();
                Contacto contacto = new Contacto(nombre, telefono);
                agenda.addContacto(contacto);
                break;
            case 2:
            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }
}
