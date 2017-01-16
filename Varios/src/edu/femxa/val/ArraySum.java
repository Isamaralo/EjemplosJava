package edu.femxa.val;

public class ArraySum {
    
    private int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
    
    public static void main(String[] args) {
        /**
        * HACED EL CUERPO DEL MAIN
        * PARA QUE DEVUELVA LA NOTA
        * MEDIA 
        * 
        * Ojo con los tipos
        * la media será real (float)
        * 
        */
        int suma = 0;
        float f_suma = 0;
        float media = 0;
        ArraySum as = new ArraySum();
        
        for (int i = 0; i < as.array_notas.length; i++) {
            suma += as.array_notas[i];
        }
        
        f_suma = (float) suma;
        media = f_suma / as.array_notas.length;
        System.out.println("La nota media es: " +media);
    }

}