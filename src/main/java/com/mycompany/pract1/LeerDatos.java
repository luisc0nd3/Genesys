/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pract1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.mycompany.dto.PersonDTO;

/**
 *
 * @author ASUS
 */
public class LeerDatos {
//String Nom, Edad, Sexo, Correo,Telefono,Estatura, Peso;
   public static void main(String[] args) throws IOException {
    boolean ft=false;
    PersonDTO person = new PersonDTO(); //>jdk 8 inyeccion de dependencias Spring
    ArrayList<PersonDTO> people = new ArrayList<>();
    people.add(person);
    //ciclo [10 - 100] n
    
//    for(int i = 0; i<100; i++) {
//    	
//    }
    
    person.setName("Luis");
    person.setEmail("luis@gmail.com");
    String Nom="", Edad="", Sexo="", Correo="", Telefono="", Estatura="", Peso="";
    System.out.println("Ingrese Datos");
    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in)); 
    /*String s = bufferRead.readLine(); 
    System.out.println(s);*/
    while (ft==false){
     System.out.println("Nombre: ");
     Nom = bufferRead.readLine();
     if (!ValidarLetras(Nom.trim()))
          System.err.println("Solo se aceptan Letras");
     else
      ft=true;
    }    ft=false;
    while (ft==false){
     System.out.println("Edad: ");
     Edad = bufferRead.readLine();
     if (!ValidarNumero(Edad.trim()))
          System.err.println("Solo se aceptan Numeros");
     else
      ft=true;
    }ft=false;
    while (ft==false){
     System.out.println("Sexo");
     System.out.println("(M)asculino,(F)emenino, (N)o Definido: ");
     Sexo = bufferRead.readLine();
     if (!ValidarLetras(Sexo.trim()))
          System.err.println("Solo se aceptan Letras");
     else
      ft=true;
     //if (Sexo=="Masculino")
    }
    ft=false;
    while (ft==false){
    System.out.println("Correo Electronico: ");
    Correo = bufferRead.readLine();
    if (!ValidarCorreo(Correo.trim()))
        System.err.println("Correo no valido o datos faltantes");
     else
      ft=true;
    }
    ft=false;
    while (ft==false){
     System.out.println("Telefono: ");
     Telefono = bufferRead.readLine();
     if (!ValidarTelefono(Telefono.trim()))
          System.err.println("Solo se aceptan Numeros o elvalor no es valido");
     else
      ft=true;
    }ft=false;
    while (ft==false){
     System.out.println("Estatura(cm): ");
     Estatura = bufferRead.readLine();
     if (!ValidarNumero(Estatura.trim()))
          System.err.println("Solo se aceptan Numeros o el valor no es valido");
     else
      ft=true;
    }
    ft=false;
    while (ft==false){
     System.out.println("Peso(kg): ");
     Peso = bufferRead.readLine();
     if (!ValidarNumero(Peso.trim()))
          System.err.println("Solo se aceptan Numeros o el valor no es valido");
     else         
      ft=true;
    }
    System.out.println("----");
    System.out.println(Nom);
    System.out.println(Edad);
    System.out.println(Sexo);
    System.out.println(Correo);
    System.out.println(Telefono);
    System.out.println(Estatura);
    System.out.println(Peso);
    
    
   } 
   public static boolean ValidarLetras(String datos){
     return datos.matches("[a-zA-Z\\s]*");
    }
   public static boolean ValidarNumero(String Datos){
        return Datos.matches("[0-9]{1,3}");
    }
   public static boolean ValidarTelefono(String Tele){
    return Tele.matches("[0-9]{8,12}");
   }
   public static boolean ValidarCorreo(String correo){
    return correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
   }
}

