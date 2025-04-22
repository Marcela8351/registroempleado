import java.util.Scanner;

public class sueldos {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int dtrabajados = 0, dfestivos=0, stotal=0;
        String tel="", direccion ="", nombre="", apellido="", cc="";

        System.out.println("Inglrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = leer.nextLine();
        System.out.println("Ingrese su cedula: ");
        cc = leer.nextLine();
        System.out.println("Ingrese su número celular: ");
        tel = leer.nextLine();
        System.out.println("Ingrese su dirección: ");
        direccion = leer.nextLine();
        System.out.println("Ingrese cuantos días laboro en el mes 15 o 30: ");
        dtrabajados = leer.nextInt();
        System.out.println("si trabajo días festivos ¿indiquenos cuentos fueron?: ");
        dfestivos = leer.nextInt();

        if(dtrabajados == 15){
            stotal = 750000 + (dfestivos * 50000);
        }
        else if(dtrabajados == 30){
            stotal = 1500000 + (dfestivos * 50000);
        }
        else {
            System.out.println("Número de días trabajados invalidos");
        }

        System.out.println("Nombre: " + nombre + apellido );
        System.out.println("Cedula: " + cc );
        System.out.println("telefono: " + tel);
        System.out.println("Dirección: " + direccion);
        System.out.println("Días trabajados: " + dtrabajados);
        System.out.println("Días festivos: " + dfestivos);
        System.out.println("Total sueldo: " + stotal);

    }
}