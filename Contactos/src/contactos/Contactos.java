
package contactos;
import java.util.Scanner;
class Contacto
{
    String nombre;
    int telefono;

public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        int tamano = 5;
        Contacto contactos[] = new Contacto[tamano];
        for(int i=0; i<tamano; i++)
            contactos[i] = new Contacto();
        
        int opcion;
        do
        {
            System.out.println("Menu:");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();
            
        }while(opcion!=0);
    }
}
    

