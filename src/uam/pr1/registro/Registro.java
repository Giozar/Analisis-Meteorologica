/*
MANUEL GIOVANNI CORTAZAR DE LA CRUZ
2193001368
PROGRAMA 1
 */
package uam.pr1.registro;

/**
 *
 * @author giova
 */
public class Registro {
    private int clave;
    private float temperatura;

    public Registro(int clave, float temperatura) {
        this.clave = clave;
        this.temperatura = temperatura;
    }

    public Registro() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Registro{" + "clave=" + clave + ", temperatura=" + temperatura + '}';
    }
    
    
    
}
