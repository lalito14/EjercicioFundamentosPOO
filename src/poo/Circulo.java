/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Eduardo
 */
public class Circulo extends FiguraGeometrica {
    
    public Circulo (float radio){
        super(radio);        
    }
    
    @Override
    public float calcularArea(){
        return (float) ((Math.PI) * super.getLado() * super.getLado());
    }
    
    @Override
    public float calcularPerimetro(){
        return (float) ((Math.PI) * 2 * super.getLado());
    }
    
    @Override
    public int obtenerTipo(){
        return 3;
    }
   
}
