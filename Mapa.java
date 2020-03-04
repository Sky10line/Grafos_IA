
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
public class Mapa {
    private List<No> mapa = new ArrayList();
    private List<No> viz = new ArrayList();
    private int linhas, colunas;
    
    public Mapa(int linhas, int colunas){
        
    }
    
    public void cria_mapa(){
        int tamanho = linhas*colunas;
        
        for(int i = 0; i < tamanho; i++){
            No no = new No(i);
            mapa.add(no);
        }
    }
    
    public void configura_mapa(){
        for (No no: mapa){
            
            no.setVizinhos();
        }
    }
}
