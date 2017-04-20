/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import grafos.BFS.BFS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author clodoaldo
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BFS buscaEmLargura = new BFS();
        
        VerticeBL a = new VerticeBL();
        a.setId("a");
        VerticeBL b = new VerticeBL();
        b.setId("b");
        VerticeBL c = new VerticeBL();
        c.setId("c");
        VerticeBL d = new VerticeBL();
        d.setId("d");
        
        Grafo g = new Grafo();
        Map<VerticeBL, ArrayList<VerticeBL>> grafo = g.getGrafo();
        
        ArrayList<VerticeBL> abl = new ArrayList<>();
        ArrayList<VerticeBL> cbl = new ArrayList<>();
        
        abl.add(b);
        abl.add(c);
        
        cbl.add(d);
//        System.out.println(abl.size());
        grafo.put(a, abl);
        grafo.put(c, cbl);
        
        buscaEmLargura.bfs(grafo, a);
        
        printGrafo(grafo);
    }

    private static void printGrafo(Map<VerticeBL, ArrayList<VerticeBL>> grafo) {

        Iterator<Map.Entry<VerticeBL, ArrayList<VerticeBL>>> i = grafo.entrySet().iterator();
        while (i.hasNext()) {
            VerticeBL v = i.next().getKey();
            System.out.println("Vertice: " + v.getId().toString() + " adjacentes: " + grafo.get(v));
        }
    }

}
