/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author clodoaldo
 */
public class BuscaEmProfundidade {

    int tempo = 0;

    private void printGrafo(Map<VerticeBL, ArrayList<VerticeBL>> g) {
        Iterator<Map.Entry<VerticeBL, ArrayList<VerticeBL>>> i = g.entrySet().iterator();

        while (i.hasNext()) {
            VerticeBL v = i.next().getKey();
            System.out.println("Vertice: " + v.getId().toString() + " adjacentes: " + g.get(v));
        }
    }

    public void buscaEmProfundidade(Grafo g) {
        Map<VerticeBL, ArrayList<VerticeBL>> grafo = g.getGrafo();
        Iterator<Map.Entry<VerticeBL, ArrayList<VerticeBL>>> i = grafo.entrySet().iterator();

        while (i.hasNext()) {
            VerticeBL v = i.next().getKey();
            v.setCor("branco");
        }
        this.tempo = 0;
    }

}
