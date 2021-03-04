package Ejercicio4;
import java.util.List;

public class Profesor extends Persona{
    String str;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {

        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Tel�fono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        recorrePrestamos();
    }

    private void recorrePrestamos() {
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
