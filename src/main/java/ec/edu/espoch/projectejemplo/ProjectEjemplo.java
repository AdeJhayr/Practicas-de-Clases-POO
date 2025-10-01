package ec.edu.espoch.projectejemplo;

import java.util.Scanner;

public class ProjectEjemplo 
{
    public static void main(String[] args) 
    {
        //creamos un objeto a parti de la variable, clase estudiantes
        Estudiantes estudianteUno = new Estudiantes();
        Estudiantes estudianteDos = new Estudiantes();
        //asigamos sus variables en funcion de la clase
        estudianteUno.nombres = "Felipe";
        estudianteUno.identificador = 250052;
        estudianteUno.caloficaiones = 10;
        
        estudianteDos.nombres = "Juan";
        estudianteDos.identificador = 25456;
        estudianteDos.caloficaiones = 5;
        
        //escribimos en pantalla lo registrado
        System.out.println("Nombre:"+ " "+estudianteUno.nombres);
        System.out.println("Identificacion:"+" "+estudianteUno.identificador);
        System.out.println("Calificacion:"+" "+estudianteUno.caloficaiones);
        
        System.out.println("  ");
        
        System.out.println("Nombre:"+ " "+estudianteDos.nombres);
        System.out.println("Identificacion:"+" "+estudianteDos.identificador);
        System.out.println("Calificacion:"+" "+estudianteDos.caloficaiones);


    }

}
