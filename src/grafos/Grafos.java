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
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VerticeBL a = new VerticeBL();
        a.setId("a");
        VerticeBL b = new VerticeBL();
        b.setId("b");
        VerticeBL c = new VerticeBL();
        c.setId("c");
        VerticeBL d = new VerticeBL();
        d.setId("d");
        Grafo g = new Grafo();
        ArrayList<VerticeBL> abl = new ArrayList<>();
        Map<VerticeBL, ArrayList<VerticeBL>> grafo = g.getGrafo();
        abl.add(b);
        System.out.println(abl.size());
        grafo.put(a, abl);
        printGrafo(grafo);
    }

    private static void printGrafo(Map<VerticeBL, ArrayList<VerticeBL>> grafo) {
//        Iterator<Map.Entry<String, String>> i = codes.entrySet().iterator();
//        while (i.hasNext()) {
//            String key = i.next().getKey();
//            System.out.println(key + ", " + codes.get(key));
//        }
        Iterator<Map.Entry<VerticeBL, ArrayList<VerticeBL>>> i = grafo.entrySet().iterator();
        while (i.hasNext()) {
            VerticeBL v = i.next().getKey();
            System.out.println("Vertice: " + v.getId().toString() + " adjacentes: " + grafo.get(v));
        }
    }

}
