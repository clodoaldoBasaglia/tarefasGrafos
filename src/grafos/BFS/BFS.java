/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.BFS;
import grafos.Grafo;
import grafos.VerticeBL;
import java.util.*;

/**
 *
 * @author a1380311
 */
public class BFS {
    //
	Queue q = new LinkedList();
	
    public void bfs(Grafo g, VerticeBL s)
    {
        Map<VerticeBL, ArrayList<VerticeBL>> grafo = g.getGrafo();
        VerticeBL node = new VerticeBL();
        node = s;
        node.setCor("Branco");
        
        ArrayList<VerticeBL> get = grafo.get(s);
        
        Queue<VerticeBL> queue = new LinkedList<VerticeBL>();

        if(grafo == null) return;
        
        queue.add(s);

        while(!queue.isEmpty())
        {
           
            VerticeBL r = queue.remove(); 

            for(VerticeBL n: r.getChild())
            {
                if(n.getCor().equals("Branco"))
                {
                    queue.add(n);
                    n.setCor("Cinza");
                }
            }
        }


    }
    
}

