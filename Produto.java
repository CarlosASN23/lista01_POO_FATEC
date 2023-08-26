package fatecfranca.lista1;

public class Produto {
    
    int id; // int é um tipo de dado primitivo
    String nome;  //String é um tipo de dado de Classe
    int qtde; // int é um tipo de dado primitivo
    float preco; // float é um tipo de dado primitivo
    boolean estoqueCritico; // boolean é um tipo de dado primitivo
    String descricao; // String é um tipo de dado de Classe
    // outros exemplos do tipo Classe: integer, Float, Boolean
    // o que diferencia um tipo Classe do tipo primitivo é a caixa alta da primeira letra
    // Recomenda-se trabalhar com o tipo String como Classe e os demais como primitivo
    // variaveis com nomes compostos a segunda palavra deverá começar com letra maiscula
 
    
    public Produto(int id, String descricao, String nome,float preco, int qtde, boolean estoqueCritico){
        
        // deve-se criar um public para que o método construtor possa funcionar de forma correta
        
        this.id=id;  
        this.descricao=descricao;
        this.nome=nome;
        this.preco=preco;
        this.qtde=qtde;
        this.estoqueCritico=estoqueCritico; 
        
        // Para a criação do chamamento precisamos atribuir a função "this."
    }
    public void mostrarObjeto(){
        
        // método para criar a forma para mostrar os objetos
        
        System.out.println("\nid: " + this.id + "\nNome: "+this.nome
        + "\nDescricao: "+ this.descricao + "\nPreco: R$"+ this.preco
        + "\nQtde: " + this.qtde + "\nEstoque Critico: " + (this.estoqueCritico ? "Sim":"Não"));
    }
      // Crie um método para comprar um produto. A quantidade 
      // a ser comprada deve ser passado como parâmetro (reabastecimento de estoque)
    public void compraObjeto(int x){
        
        this.qtde = this.qtde + x;
        System.out.println("\nCompra realizada com sucesso! ");
    }
     //vender objeto somente se houver estoque
    public void venderObjeto(int y){
    
        if(y <= this.qtde){
            this.qtde = this.qtde - y;
            System.out.println("Venda realizada com sucesso");
               
    }else{
            System.out.println("Estoque insuficiente: Não foi possivel realizar a venda");
        }
    } // aumentar o preço do produto em X% passado como parâmetro
    public void aumentarPreco(float x){
        
        if (x>0){
            this.preco = this.preco*(1+(x/100));
            System.out.println("O novo preço é R$" + this.preco);
        }else{
            System.out.println("Entre com um valor em x maior do que zero");
        }
    }
    
    // diminuir o preço do produto em X% passado como parâmetro
    
    public void diminuirPreco(float x){
        
        if (x>0){
        this.preco = this.preco * (1-(x/100));
        System.out.println("Desconto realizado com sucesso: novo valor R$" + this.preco);
    }else{
            System.out.println("Não foi possivel realizar o desconto!");
        }
 }
}