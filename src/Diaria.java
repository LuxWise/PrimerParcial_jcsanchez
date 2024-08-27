import javax.xml.crypto.Data;
import java.util.Date;

public class Diaria {
    public boolean correspodeEjecutar() {
        return true;
    }
    public void ejecutar() {
        System.out.println("Ejecuta tarea diaria");
    }

    public void doEjecutar() {
        System.out.println("Ejecuta tarea diaria");
    }

    public Date ultimaEjecucion() {
        return new Date();
    }

    public void vecesQueSeEjecuto(Date Date) {
        System.out.println("Ejecicion en " + Date); ;
    }

    public void vecesQueDioError(Date Date) {
        System.out.println("Error en :" + Date);
    }
}
