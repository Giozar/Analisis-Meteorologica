/*
MANUEL GIOVANNI CORTAZAR DE LA CRUZ
2193001368
PROGRAMA 1
 */
package uam.pr1.operaciones;

import java.util.Random;
import uam.pr1.registro.Registro;

/**
 *
 * @author giova
 */
public class Operaciones {
    
    public Registro [] rellenarDatos(Registro [] areax){
        //Rellenar Areas con datos aleatorios
        Random random = new Random();
        for(int i=0;i<50;i++) {
		String area = "AREA"+i;
		float temp = random.nextInt(15)+25;
		//System.out.print(area+" ");

                Registro dato = new Registro(i+1,temp);
                areax[i] = dato;
                //System.out.println(temp);
	}
        return areax;
    }
    
    //Imprimir datos
    public void imprimirDatos(Registro [] area){
        for(int i = 0; i < area.length; i++){
            System.out.println(area[i].toString());
        }
    }
    
    
    //Promedio datos 
    public float promedioDatos(Registro [] areax){
        float promT = 0;
        Registro prom = new Registro();
        
        for (int i = 0; i < areax.length; i++){
            promT = areax[i].getTemperatura() + promT;

        }
        
        promT = promT/areax.length;
        
        return promT;
        
    }
    
    //promedio de area mayor
    public void promedioMayor (float area1,float area2,float area3){
        if (area1 > area2) {
            if (area1 > area3) {
                System.out.println("El mayor promedio es de AREA 1: " + area1);                                             
            } else {
                System.out.println("el mayor promedio es de AREA 3: " + area3);     
            }
        } else if (area2 > area3) {
            System.out.println("el mayor promedio es de AREA 2: " + area2);
        } else {
            System.out.println("el mayor promedio es de AREA3: " + area3);
        }
    }
}
