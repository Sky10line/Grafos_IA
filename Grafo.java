package Grafos_IA;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.raoki
 */
public class Grafo {
    private List<No> vertices = new ArrayList();
    
    public Grafo(List<No> vertices_do_grafo){
        criaGrafo(vertices_do_grafo);
    }
    
    public void criaGrafo(List<No> v){
        for(No no: v){
            vertices.add(no);
        }
    }
    
    public void imprime_grafo(){
        for (No no: vertices){
            no.imprimeVizinhos();
            System.out.println(" ");
            System.out.println("-------------");
        }
    }
}
