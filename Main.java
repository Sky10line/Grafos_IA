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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    List<No> vertices_aula = new ArrayList();
//        
//        No noA = new No("A");
//        No noB = new No("B");
//        No noC = new No("C");
//        No noD = new No("D");
//        No noE = new No("E");
//        No noF = new No("F");
//        No noG = new No("G");
//        
//        
//        
//        List<No> vizinhoA = new ArrayList();
//        vizinhoA.add(noG);
//        vizinhoA.add(noD);
//        vizinhoA.add(noB);
//        
//        noA.setVizinhos(vizinhoA);
//        
//        List<No> vizinhoB = new ArrayList();
//        vizinhoB.add(noA);
//        vizinhoB.add(noC);
//        vizinhoB.add(noF);
//        
//        noB.setVizinhos(vizinhoB);
//        
//        vertices_aula.add(noA);
//        vertices_aula.add(noB);
//        
//        
//        
//        Grafo Grafo = new Grafo(vertices_aula);
//        Grafo.imprime_grafo();

    Mapa maps = new Mapa(6, 6);
    maps.cria_mapa();
    maps.configura_mapa();
    maps.getNo(8).setParede(true);
    
    maps.imprime();
    }
    
}
