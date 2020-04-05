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
public abstract class FiguraGeometrica {
    /*Atributos*/
    private float lado;
    private int tipo;
    /*Constructores*/
    public FiguraGeometrica(float lado, int tipo){
        this.lado = lado;
        this.tipo = tipo;
    }
    
    public FiguraGeometrica(float lado){
        this.lado = lado;
    }
    
    public FiguraGeometrica(){
    }
    
    public float getLado(){
        return lado;
    }
    
    public void setLado(float lado){
        this.lado = lado;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int Tipo){
        this.tipo = tipo;
    }
    
    public float calcularPerimetro(){
        return 0;
    }
    
    public float calcularArea(){
        return 0;
    }
    
    public int obtenerTipo(){
        return 0;
    }
}
