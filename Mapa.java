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
        int i = 0;
        for (No no: mapa){
            i++;
            
            //primeira linha
            if(no.getID()/6 == 0){        
                //adiciona o ponto debaixo
                no.adicionaVizinho(mapa.get(6+i));
            
//                //adiciona o ponto da frente e debaixo da frente
//                if(no.getID() != 5){
//                    //adiciona o da frente
//                    no.adicionaVizinho(mapa.get(1+i));
//                    
//                    //adiciona o debaixo da frente
//                    no.adicionaVizinho(mapa.get(6+i));
//                }
//                
//                //adicion o ponto de trás e debaixo de tras
//                if(no.getID() != 0){
//                    //adiciona o de trás
//                    no.adicionaVizinho(mapa.get(i-1));
//                    
//                    //adiciona o debaixo e de trás
//                    no.adicionaVizinho(mapa.get(5+i));
//                    
//                }   
            }
            
            //segunda linha - penultima
            if (no.getID() >= 6 && no.getID() <= 29){
                //adiciona o ponto debaixo
                no.adicionaVizinho(mapa.get(i+6));
                
                //adiciona o ponto de cima
                no.adicionaVizinho(mapa.get(i-6));
            }
            
            //ultima linha
            if (no.getID() >= 30){
                //adiciona o ponto de cima
                no.adicionaVizinho(mapa.get(i-6));
            }
            
            //primeira coluna
            if(no.getID()%6 == 0){
                //adiciona o ponto da frente
                no.adicionaVizinho(mapa.get(i+1));
            }
            
            //segund coluna - penultima
            if(no.getID()%6 >= 1 && no.getID()%6 <= 4){
                //adiciona o ponto da frente
                no.adicionaVizinho(mapa.get(i+1));
                
                //adiciona o ponto de trás
                no.adicionaVizinho(mapa.get(i-1));
            }
            
            //ultima coluna
            if(no.getID()%6 == 5){
                no.adicionaVizinho(mapa.get(i-1));
            }
        }
    }
    
    public No getNo(int no){
        return mapa.get(no);
    }
}
