/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20250901;

/**
 *
 * @author UFG
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz();
    }
    
    
    public static void matriz(){
        //SE INSTANCIA EL ESCANER PARA LA LECTURA DEL TECLADO
        Scanner sc = new Scanner(System.in);
        
        //SE INSTANCIA LA MATRIZ DE TIPO INTEGER
        int [][] matriz = new int [3] [3];
        int suma = 0;//VARIABLE PARA SUMA DE VALORES DIGITADOS
        int total_elementos =0;//CONTADOR DE ELMENTOS DE LA MATRIZ
        double promedio = 0d;//CALCULO DEL PROMEDIO DE EDADES DIGITADAS
        
        //SALIDA AL USUARIO PARA INDICAR QUE DEBE INGRESAR DATOS
        System.out.println("Ingrese los valores para una matriz 3 x 3");
        
        //SE RECORRE PRIMERO LAS FILAS CON UNA ESTRUCTURA DE CONTROL ITERATIVA 
        //DE TIPO FOR
        for(int i = 0; i<matriz.length; i++){
            /*
            EN CADA ELEMENTO DE LA ITERACION SE DEBERA OBTENER LA CANTIDAD DE ELEMENTOS
            QUE EXISTE EN EL ARREGLO (CANTIDAD DE COLUMNNAS
            */
            total_elementos += matriz[i].length; 
            /*
            SE RECORRE LAS COLUMNAS DE LA MATRIZ CON UNA ESTRUCUTURA DE CONTROL 
            ITERATIVA DE TIPO FOR
            DEBIDO A QUE DEBEMOS OBTENER EL VALOR 
            */

            //error en la iteracion de la matriz, estaba con matriz j cuando debia ser i
            for(int j = 0; j < matriz[i].length; j++){
            //SE IMPRIME LA PETICION AL USUARIO
                System.out.println("Elemento [ " +i+ "][" +j+ "]");
                
                //SE HACE LA LACTURA DEL TECLADO
                matriz [i][j] = sc.nextInt();
                
                 
            } //CIERRE EL FOR PARA COLUMNAS
        }//CIERRE DEL FOR PARA OBTENER FILAS
        
        //SALIDA DE VALORES DE LOS USUARIOS 
        System.out.println("Matriz ingresada: ");
        
        //SE RECORREN LAS FILAS DE LA MATRIZ
        for(int x = 0; x < matriz.length; x++){
            
            for(int y = 0; y <matriz[x].length; y++){
            /*SE VUELVE UN ARRAY---
            SE IMPRIME EL VALOR DE CADA CELDA DE LA MATRIZ (FILA,CLOUMNA)
            FILA: x COLUMNA:y
            */
             //correcion del orden de los numeros en el terminal   
            System.out.print(matriz[x][y]+" ");
            
            //se suman los valores de cada celda 
            suma += matriz [x][y];
        }
            
            //se imprime un salto de linea
        System.out.println();
            
        }
        //calculo de los valores
     promedio =(double) suma/total_elementos;  
     
     System.out.println("Es la sumatoria total de los elementos, la cantidad de los elementos digitados es de : " +total_elementos);
     System.out.println("El promedio de la edad es: "+promedio);
    
    
    
        sc.close();
   
    }
}
