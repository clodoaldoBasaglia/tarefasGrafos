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
public class VerticeBL extends Vertice {

    private String id;
    private String cor;
    private int d;

    public VerticeBL() {
    }

    @Override
    public String toString() {
        return "VerticeBL{" + "id=" + id + ", cor=" + cor + ", d=" + d + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

}
