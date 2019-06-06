/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Ingrese el numero de personas>:"); 
     
     int npersona=sc.nextInt();
     sc.nextLine();
     Persona[] personas=new Persona[npersona];
     int sumatoria=0;
     for(int i=0;i<personas.length;i++){
        System.out.println("Persona:"+(i+1)+" de "+npersona);
        
        System.out.println("Nombre:");
        String Nombre=sc.nextLine();
        
        System.out.println("Apellido:");
        String apellido=sc.nextLine();
        System.out.println("Calificacion:");
        int calificacion=sc.nextInt();
        sc.nextLine();
        personas[i]=new Persona(Nombre,apellido,calificacion);
        sumatoria=sumatoria+calificacion;
     }
        System.out.println("\nNombre\t\tApellido\t\tCalificacion"); 
        for(int i=0;i<personas.length;i++){
        System.out.println(personas[i].getNombre()+"\t\t"+personas[i].getApellido()+"\t\t\t"+personas[i].getCalificacion());   
     }
       System.out.println("\nel promedio es:"+sumatoria/npersona); 
     /*int edades[];
     String Nombre[];
     Scanner sc=new Scanner(System.in);
     System.out.println("Ingrese el numero de elementos del arreglo");
     int numeroElementos=sc.nextInt();
     edades=new int[numeroElementos];
     for(int i=0;i<edades.length;i++){
     System.out.println("Ingrese el elemento"+i+1+":");    
     edades[i]=sc.nextInt();
     }
     
     System.out.println("Los elementos de arreglo son:");
     for(int i=0;i<edades.length;i++){
         System.out.println(edades[i]);
     }
     System.out.println("Ingrese el numero de elementos del arreglo");
     int numeroElemento=sc.nextInt();
     Nombre=new String[numeroElemento];
     for(int i=0;i<Nombre.length;i++){
     System.out.println("Ingrese el elemento"+i+1+":");    
     Nombre[i]=sc.nextLine();
     sc.nectLine();
     }
     System.out.println("Los elementos de arreglo son:");
        for (String Nombre1 : Nombre) {
            System.out.println(Nombre1);
        }
        edades= new int [3];
        edades[0]=12;
        edades[1]=10;
        edades[2]=15;
        System.out.println("Elemento indice 0\t"+edades[0]);
        System.out.println("Elemento indice 1\t"+edades[1]);
        System.out.println("Elemento indice 2\t"+edades[2]);
        Nombre=new String[3];
        Nombre[0]="pepe";
        Nombre[1]="lucas";
        Nombre[2]="elson";
        System.out.println("Persona indice 0\t"+Nombre[0]);
        System.out.println("Persona indice 1\t"+Nombre[1]);
        System.out.println("Persona indice 2\t"+Nombre[2]);*/
                     
    }
    
}   
    
    

