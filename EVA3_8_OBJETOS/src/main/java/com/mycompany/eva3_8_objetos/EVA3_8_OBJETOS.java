/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_objetos;

/**
 *
 * @author acost
 */
public class EVA3_8_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        //Scanner input = new Scanner(System.in);
        //int[] arreglo = new int[5];
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellido = "Pérez";
        perso1.edad = 50;
        System.out.println(perso1);
        
        Persona perso2 = new Persona();
        perso2.nombre = "Pedro";
        perso2.apellido = "Páramo";
        perso2.edad = 70;
        System.out.println(perso2);
        imprimirPersonas(perso2);
                
        
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Dirección " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + );
        System.out.println()
    }
}

//SON PLANTILLAS
//SON TIPO DE DATOS
class Persona{
    String nombre;
    String apellido;
    int edad;
    
}