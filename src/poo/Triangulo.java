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
public class Triangulo extends FiguraGeometrica{
    float altura;
    
    public Triangulo (float base, float altura){
        super(base);
        this.altura = altura;
    }
    
    @Override
    public float calcularArea(){
        return (super.getLado() * altura)/2;
    }
    
    @Override
    public float calcularPerimetro(){
        return super.getLado()*3;
    }
    
    @Override
    public int obtenerTipo(){
        return 2;
    }

}
