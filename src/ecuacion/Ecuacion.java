
package ecuacion;

import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args) {
        
        float a, b, c;
       try{ 
        Scanner sca=new Scanner (System.in);
        
        System.out.println("Inserta la variable a");
        a = sca.nextFloat();
        
        System.out.println("Inserta la variable b");
        b = sca.nextFloat();
        
        System.out.println("Inserta la variable c");
        c = sca.nextFloat();

        float raiz = b*b-(4*a*c);
        
        String solucion1 = null, solucion2 = null, intermedio1, intermedio2;
        
        if (raiz < 0) {
        
            System.out.println("No tiene solución");
        }else{
        
            float operacionArriba1 = (float) (-1*b+Math.sqrt(raiz));
            float operacionTotal1 = operacionArriba1/(2*a);
            
            float operacionArriba2 = (float) (-1*b - Math.sqrt(raiz));
            float operacionTotal2 = operacionArriba2/(2*a);
            
            intermedio1 = operacionTotal1 + "";
            intermedio2 = operacionTotal2 + "";
            
            if (intermedio1.equals("NaN") | intermedio1.equals("-Infinity")){
                solucion1 = "\"sin solucion\"";
                
            }else{
            solucion1 = intermedio1;    
            }
            if (intermedio2.equals("NaN") | intermedio2.equals("-Infinity")){
                solucion2 = "\"sin solucion\"";
                
            }else{
            solucion2=intermedio2;
            }
        System.out.println("El resultado es "+"R1="+operacionTotal1
                +" y el segundo es "+operacionTotal2);
    }
       }catch (Exception ex){
           System.out.println("Algo salió mal"+ex.toString());
       }
}
}
