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
    public void bfs(Map<VerticeBL, ArrayList<VerticeBL>> g, VerticeBL s)
    {
        /*Pegando a lista de adjacência do vértice(s) inical da busca*/
        ArrayList<VerticeBL> vertices = g.get(s);
       
        //Setando a cor cinza, pois o vértice acabou de ser visitado e o d como 0
        s.setCor("cinza");
        s.setD(0);
//        System.out.println(vertices.get(0));
        
//      Criando uma fila para a busca em largura dos vértices adjacentes.
        Queue<VerticeBL> queue = new LinkedList<VerticeBL>();

        if(s == null) return;
        
        queue.add(s);

/*        Enquanto a fila não for vazia procurar pelos vértices adjascentes ao inicial
          que forem da cor branca, colocar a cor como cinza e adicionar na fila para
            buscar os vertices adjascentes a eles*/
        while(!queue.isEmpty())
        {
           
            VerticeBL r = queue.remove(); 
            ArrayList<VerticeBL> v = g.get(r);
//            System.out.println(r);
//            System.out.println(v);

            if(v != null){
                for(VerticeBL n: v)
                {
                    if(n.getCor().equals("branco"))
                    {
                        queue.add(n);
                        n.setCor("cinza");
                        n.setD(r.getD() + 1);
                    }
                }
            }
            r.setCor("preto");
//            System.out.println(r);
        }
    }
}

