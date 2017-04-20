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
public class OrdenacaoTopologica {

    public ArrayList<VerticeBL> TopologicalSort(Map<VerticeBL, ArrayList<VerticeBL>> grafo) {
        Iterator<Map.Entry<VerticeBL, ArrayList<VerticeBL>>> i = grafo.entrySet().iterator();
        BuscaEmProfundidade bep = new BuscaEmProfundidade();
        while (i.hasNext()) {
            VerticeBL v = i.next().getKey();
//            Grafo g = grafo.get(v);
//            bep.buscaEmProfundidade(grafo.get(v));
        }
        return null;
    }
}
