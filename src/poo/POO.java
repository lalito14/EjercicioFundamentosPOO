/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculadora();
        
    }
    
    public static void calculadora(){
           int a,b,c,d;
           Scanner scanner = new Scanner(System.in);
        System.out.println("Elija el tipo de figura"); // 1 Cuadrado; 2 Triangulo ; 3 Circulo
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        a = scanner.nextInt(); b = 0;
        do {            
    switch(a){
        case 1:
            System.out.println("Elija un numero para el lado");
            FiguraGeometrica Cuadrado = new Cuadrado(b = scanner.nextInt());
            figuras.add(Cuadrado);
            break;
        case 2:
            System.out.println("Elija un numero para el lado");
            FiguraGeometrica Triangulo = new Triangulo(b = scanner.nextInt(),c = scanner.nextInt());
            figuras.add(Triangulo);
            break;
        case 3:
            System.out.println("Elija un numero para el lado");
            FiguraGeometrica Circulo = new Circulo(b = scanner.nextInt());
            figuras.add(Circulo);
            break;
        default:
            System.out.println("Forma Desconocida");
            break;
    }  
        System.out.print("Desea ingresar otra figura [s/n] : ");
            d = scanner.next().charAt(0);
        if (d == 'S' ||  d=='s'){
            System.out.println("Elija el tipo de figura"); //Reingresar tipo de figura
            a = scanner.nextInt();
        }
        } while ((d=='S' ||  d=='s'));
       
           for (FiguraGeometrica f : figuras) {
    switch(f.obtenerTipo()){
        case 1:
            System.out.println("Cuadrado"+" "+"Area"+" "+f.calcularArea()+" "+"Perimetro"+" "+f.calcularPerimetro());
            break;
        case 2:
            System.out.println("Triangulo"+" "+"Area"+" "+f.calcularArea()+" "+"Perimetro"+" "+f.calcularPerimetro());
            break;
        case 3:
            System.out.println("Circulo"+" "+"Area"+" "+f.calcularArea()+" "+"Perimetro"+" "+f.calcularPerimetro());
            break;
        default:
            break; 
        }
           }
    }
}
 
     
        
    
