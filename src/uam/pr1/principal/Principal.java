/*
MANUEL GIOVANNI CORTAZAR DE LA CRUZ
2193001368
PROGRAMA 1
 */
package uam.pr1.principal;
import java.util.Random;
import uam.pr1.operaciones.Operaciones;
import uam.pr1.registro.Registro;

/**
 *
 * @author giova
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        Registro [] area1;
        area1 = new Registro [50];
        
        Registro [] area2;
        area2 = new Registro [50];
        
        Registro [] area3;
        area3 = new Registro [50];
        
        Operaciones op = new Operaciones();
        
        int msj = 0;
        
        //se muestra AREA 1
        System.out.println("AREA 1:");
        area1 = op.rellenarDatos(area1);
        op.imprimirDatos(area1);
        
        
        for(int i=0; i<50; i++){
            if (area1[i].getTemperatura()>28){
                msj++;
            }
        }
        System.out.println("temperaturas mayores a 28 grados " + msj + " registradas");
        
        if(msj > 15){
            System.out.println("AREA:: ALERTA");
        }else{
            System.out.println("AREA:: SEGURA");
        }
        
        msj = 0;
        
        float promArea1 = op.promedioDatos(area1);
        System.out.println("Promedio de Area1: " + promArea1);
        System.out.println();
        
        System.out.println("AREA 2:");
        area2 = op.rellenarDatos(area2);
        float promArea2 = op.promedioDatos(area2); 
        op.imprimirDatos(area2);
        for(int i=0; i<50; i++){
            if (area1[i].getTemperatura()>25){
                msj++;
            }
        }
        System.out.println("temperaturas mayores a 25 grados: " + msj + " registradas");
        
        if(msj > 15){
            System.out.println("AREA:: ALERTA");
        }else{
            System.out.println("AREA:: SEGURA");
        }
        
        msj = 0;
        System.out.println("Promedio de Area2: " + promArea2);
        System.out.println();
        
        System.out.println("AREA 3:");
        area3 = op.rellenarDatos(area3);
        float promArea3 = op.promedioDatos(area3); 
        op.imprimirDatos(area3);
        for(int i=0; i<50; i++){
            if (area1[i].getTemperatura()>30){
                msj++;
            }
        }
        System.out.println("temperaturas mayores a 30 grados: " + msj + " registradas");
        
        if(msj > 15){
            System.out.println("AREA:: ALERTA");
        }else{
            System.out.println("AREA:: SEGURA");
        }
        
        msj = 0;
        System.out.println("Promedio de Area3: " + promArea3);
        System.out.println();
        
        op.promedioMayor(promArea1, promArea2, promArea3);
    }     
}
