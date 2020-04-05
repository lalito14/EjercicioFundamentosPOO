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
public class Cuadrado extends FiguraGeometrica {
    
    public Cuadrado (float base){
        super(base);
    }
    
    @Override
    public float calcularArea(){
        return super.getLado() * super.getLado();
    }
    
    @Override
    public float calcularPerimetro(){
        return super.getLado()*4;
    }
    
    @Override
    public int obtenerTipo(){
        return 1;
    }

}
