
package Aulao;


public class Teste_Main {

    public static void main(String[] args) {
        
        int x = 0;
        
        Cidade cid2 = new Cidade("Alvorada");
        System.out.println("Nome do cid2:"+cid2.nome);
        System.out.println("======================>");
        Cidade cid3     =  new   Cidade(10);
        Cidade cid4     = new    Cidade("Capao da Canoa");
        Cidade cid5     = new    Cidade(12,"Cacequi");
        Cidade cid6     = new    Cidade(15,"Camaqua");
        
        
        
        
        cid5.imprimirCidade();
        
        System.out.println("======================>");
        System.out.println("Cidade:\n"+cid5.retornarCidade());
        cid5.nome = "Rosário do Sul";
        System.out.println("======================>");
        System.out.println("Cidade:\n"+cid6.retornarCidade());
        
        
        
        
        
    
        Cidade cid = new Cidade();
        cid.id = 25;
        cid.nome="Porto_Alegre";
        
        
        Cliente cli  = new Cliente();
        cli.id = 1;
        cli.nome = "João";
        cli.endereco = " Av. Ipiranga 1200";
        cli.municipio = cid;
        System.out.println("\nnome:"+cli.nome+"\nEndereco:"+cli.endereco+"\nCidade:"+cli.municipio.nome);
        
        
        }  
    }
// CTRL BARRRA DE DIV TRANSFORMA E COMENTÁRIO//
// VOID SEM RETORNO//