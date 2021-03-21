
package Aulao;


public class Cidade {
    public int id;
    public String nome;
    
    public Cidade(){
    
   }
    
   public Cidade(String nome){  // metodo contrutor //
   this.nome = nome;
    
    
    }
    public Cidade(int id){  // metodo contrutor //
   this.id = id;
    
    
    }
    
    public Cidade (int id, String nome){
        this.nome = nome;
        this.id = id;
    
    }
    
    public void imprimirCidade(){
        
        System.out.println("Id:" +this.id+ "\nNome:"+ this.nome);
    }
    
    public String retornarCidade(){
       String texto = "Id"+ this.id + "\nNome:"+ this.nome;
        return texto;
    }
    
}
