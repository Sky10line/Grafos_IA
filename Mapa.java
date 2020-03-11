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
public class Mapa {
    private List<No> mapa = new ArrayList();
    private List<No> viz = new ArrayList();
    private int linhas, colunas;
    
    public Mapa(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
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
            //primeira linha
            if(no.getID()/colunas == 0){        
                //adiciona o ponto debaixo
                no.adicionaVizinho(mapa.get(colunas+i));
                
                //primeira coluna
                if(no.getID()%linhas == 0){
                    //adiciona o ponto debaixo na frente
                no.adicionaVizinho(mapa.get(colunas+i+1));
                }
                
                //segundo coluna - penultima
                if(no.getID()%linhas >= 1 && no.getID()%linhas <= linhas-2){
                //adiciona o ponto da debaixo da frente
                no.adicionaVizinho(mapa.get(colunas+i+1)); 
                //adiciona o ponto de debaixo da trás
                no.adicionaVizinho(mapa.get(colunas+i-1));
            }
                //ultima coluna
                if(no.getID()%linhas == 5){
                no.adicionaVizinho(mapa.get(colunas+i-1));
                }
            }
            
            
            
            //segunda linha - penultima
            if (no.getID() >= colunas && no.getID() <= (colunas*linhas)-colunas-1){
                //adiciona o ponto debaixo
                no.adicionaVizinho(mapa.get(i+colunas));
                //adiciona o ponto de cima
                no.adicionaVizinho(mapa.get(i-colunas));
                
                //primeira coluna
                if(no.getID()%linhas == 0){
                    //adiciona o ponto debaixo na frente
                    no.adicionaVizinho(mapa.get(i+colunas+1));
                    //adiciona o ponto de cima da frente
                    no.adicionaVizinho(mapa.get(i-colunas+1));
                }
                
                //segundo coluna - penultima
                if(no.getID()%linhas >= 1 && no.getID()%linhas <= linhas-2){
                    //adiciona o ponto debaixo na frente
                    no.adicionaVizinho(mapa.get(i+colunas+1));
                    //adiciona o ponto de cima da frente
                    no.adicionaVizinho(mapa.get(i-colunas+1));
                    //adiciona o ponto debaixo de trás
                    no.adicionaVizinho(mapa.get(i+colunas-1));
                    //adiciona o ponto de cima de trás
                    no.adicionaVizinho(mapa.get(i-colunas-1));
                    
            }
                //ultima coluna
                if(no.getID()%linhas == 5){
                    //adiciona o ponto debaixo de trás
                    no.adicionaVizinho(mapa.get(i+colunas-1));
                    //adiciona o ponto de cima de trás
                    no.adicionaVizinho(mapa.get(i-colunas-1));
                }
                
                
            }
            
            //ultima linha
            if (no.getID() >= 30){
                //adiciona o ponto de cima
                no.adicionaVizinho(mapa.get(i-colunas));
                
                //primeira coluna
                if(no.getID()%linhas == 0){
                    //adiciona o ponto de cima da frente
                    no.adicionaVizinho(mapa.get(i-colunas+1));
                }
                
                //segundo coluna - penultima
                if(no.getID()%linhas >= 1 && no.getID()%linhas <= linhas-2){
                //adiciona o ponto da cima na frente
                no.adicionaVizinho(mapa.get(i-colunas+1)); 
                //adiciona o ponto de cima de trás
                no.adicionaVizinho(mapa.get(i-colunas-1));
            }
                //ultima coluna
                if(no.getID()%linhas == 5){
                    //adiciona o ponto de cima de trás
                    no.adicionaVizinho(mapa.get(i-colunas-1));
                }
            }
            
            //primeira coluna
            if(no.getID()%linhas == 0){
                //adiciona o ponto da frente
                no.adicionaVizinho(mapa.get(i+1));     
            }
            
            //segund coluna - penultima
            if(no.getID()%linhas >= 1 && no.getID()%linhas <= linhas-2){
                //adiciona o ponto da frente
                no.adicionaVizinho(mapa.get(i+1));
                
                //adiciona o ponto de trás
                no.adicionaVizinho(mapa.get(i-1));
            }
            
            //ultima coluna
            if(no.getID()%linhas == 5){
                no.adicionaVizinho(mapa.get(i-1));
            }
          i++;
        }
    }
    
    public No getNo(int no){
        return mapa.get(no);
    }
    
    public void imprime(){
        for(int i = 0; i < colunas; i++){
            System.out.print(" _  ");
        }
        for(int j = 0; j < linhas; j++){
            System.out.println("");
            for(int i = 0; i < colunas; i++){
                System.out.print("|"+"_"+"| ");
            }
            
            
        }
    }
}
