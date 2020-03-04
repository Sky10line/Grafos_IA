
import java.util.ArrayList;
import java.util.List;

//Autor: Ryo 
//Data: 03/03/2020
//grafos de I.A
public class No {
    private List<No> vizinhos = new ArrayList();

    private String nome;
    
    public No (String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<No> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<No> vizinhos) {
        this.vizinhos = vizinhos;
    }
    
    public void imprimeVizinhos(){
        for(No no: vizinhos){
            System.out.print(no.getNome()+ "");
        }
    }
        
}
