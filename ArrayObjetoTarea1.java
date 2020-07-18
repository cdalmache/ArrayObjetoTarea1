/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.arrayobjetotarea1;

/**
  * @author Almache Cristian
 */
import java.util.Scanner;
public class ArrayObjetoTarea1 {
    
    public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("Tema:EMISION ACUSTICA Y REDES NEURONALES PARA MODELADO");
        System.out.println(" Y  CARACTERIZACION DE PROCESOS DE SOLDADURA POR FRICCION AGITACION");
    }
    
    public int dimension;
    public String material;
    public String nombre;
    
    ArrayObjetoTarea1(int dimension,String material,String nombre){
        
        this.dimension=dimension;
        this.nombre=nombre;
        this.material=material;
    }
    

        public static void main(String[] args) {
        Encabezado();
        //declara una array de enteros.
ArrayObjetoTarea1[]arreglo;
//asigna memoria para 5 objetos del tipo Estudiante
arreglo=new ArrayObjetoTarea1[5];
//inicializa el primer elemento del array
arreglo[0]=new ArrayObjetoTarea1( 245,"COBRE "," Eje");
//inicialia el segundo elemento del array
arreglo[1]=new ArrayObjetoTarea1( 360,"HIERRO ","Barra ");
arreglo[2]=new ArrayObjetoTarea1( 190," ALUMINIO "," Engrane");
arreglo[3]=new ArrayObjetoTarea1( 65,"ACERO ","Disco ");
arreglo[4]=new ArrayObjetoTarea1( 145,"POLIMERO "," Polea");
//accediendo a los elementos del array
        for(int i=0;i<arreglo.length;i++){
         System.out.println("La pieza "+i+" es un/a "+arreglo[i].nombre+" de "+arreglo[i].material+" y su dimension es: "+arreglo[i].dimension +"");      
        
        
    }
    
}
}