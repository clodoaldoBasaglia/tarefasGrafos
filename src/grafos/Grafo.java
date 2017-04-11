/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author clodoaldo
 */
public class Grafo {

    private Map<VerticeBL, ArrayList<VerticeBL>> grafo;

    public Map<VerticeBL, ArrayList<VerticeBL>> getGrafo() {
        return grafo;
    }

    public void setGrafo(Map<VerticeBL, ArrayList<VerticeBL>> grafo) {
        this.grafo = grafo;
    }

    public Grafo() {
        this.grafo = new HashMap<>();
    }

}
