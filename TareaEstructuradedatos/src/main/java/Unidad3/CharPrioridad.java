/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

public class CharPrioridad {
    
    private char dato;
    private int nivel;
    
    public CharPrioridad(char dato, int nivel){
        this.dato = dato;
        this.nivel = nivel;
    }
    
    public char getDato(){
        return dato;
    }
    
    public int getNivel(){
        return nivel;
    }
}
