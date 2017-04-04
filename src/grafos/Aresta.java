/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author clodoaldo
 */
public class Aresta {

    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Aresta() {
    }

    @Override
    public String toString() {
        return "Aresta{" + "peso=" + peso + '}';
    }

}
