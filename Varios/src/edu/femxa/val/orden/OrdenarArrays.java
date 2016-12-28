package edu.femxa.val.orden;

public class OrdenarArrays {
    
    public static int generarAleatorio ()
    {
        int aleatorio = (int) ((100 * Math.random())+1);
        return aleatorio;
    }
    
    public static void ordenBurbuja (int[] a_ent_a)
    {
        int aux = 0;
        for (int i = 0; i < a_ent_a.length; i++)
        {
            for (int j = 0; j < a_ent_a.length-i-1; j++) {
                
                if(a_ent_a[j] < a_ent_a[j+1])
                {
                    aux = a_ent_a[j+1];
                    a_ent_a[j+1] = a_ent_a[j];
                    a_ent_a[j] = aux;
                }
            }
        }
    }
    
    public static void ordenPiedra (int[] a_ent_a)
    {
        int aux = 0;
        for (int i = 0; i < a_ent_a.length; i++)
        {
            for (int j = 0; j < a_ent_a.length-i-1; j++) {
                
                if(a_ent_a[j] > a_ent_a[j+1])
                {
                    aux = a_ent_a[j];
                    a_ent_a[j] = a_ent_a[j+1];
                    a_ent_a[j+1] = aux;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int a_ent_a[] = new int[10];
        
        //Inicializo el array de enteros con números aleatorios
        for (int i = 0; i < a_ent_a.length; i++) {
            a_ent_a[i] = generarAleatorio();
        }
        
        //Muestro
        for (int i = 0; i < a_ent_a.length; i++) {
            System.out.println("Num en pos " + (i+1) + " " + a_ent_a[i]);
        }
        
        //Ordeno el array
        ordenBurbuja(a_ent_a);
        
        //Muestro array ordenado
        for (int i = 0; i < a_ent_a.length; i++) {
            System.out.println("Num en pos " + (i+1) + " " + a_ent_a[i]);
        }
        
    }

}

