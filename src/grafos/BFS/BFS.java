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
    public void initBfs(Grafo g)
    {
        
    }
    public void bfs(Grafo g, VerticeBL s)
    {
        /*Inicializando um map com o grafo e em seguida pegando a lista de adjacência
         do vértice inical da busca (s)*/
        Map<VerticeBL, ArrayList<VerticeBL>> grafo = g.getGrafo();
        ArrayList<VerticeBL> vertices = grafo.get(s);
       
        vertices.get(0).setCor("Cinza");     
        
        
        Queue<VerticeBL> queue = new LinkedList<VerticeBL>();

        if(vertices.get(0) == null) return;
        
        queue.add(s);

/*        Enquanto a fila não for vazia procurar pelos vértices adjascentes ao inicial
          que forem da cor branca, colocar a cor como cinza e adicionar na fila para
            buscar os vertices adjascentes a eles*/
        while(!queue.isEmpty())
        {
           
            VerticeBL r = queue.remove(); 
            ArrayList<VerticeBL> v = grafo.get(r);
            
            for(VerticeBL n: v)
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

