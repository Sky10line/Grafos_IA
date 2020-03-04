
import java.util.ArrayList;
import java.util.List;

//Autor: Ryo 
//Data: 03/03/2020
//grafos de I.A
public class No {
    private List<No> vizinhos = new ArrayList();
    private int id;
    private String nome;
    
    public No (int id){
        setID(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setID(int id){
        this.id = id;
    }
    public List<No> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<No> vizinhos) {
        this.vizinhos = vizinhos;
    }
    
    public void adicionaVizinho(No addNo)
    {
        this.vizinhos.add(addNo);
    }
    
    public void imprimeVizinhos(){
        for(No no: vizinhos){
            System.out.print(no.getNome()+ "");
        }
    }
        
}
