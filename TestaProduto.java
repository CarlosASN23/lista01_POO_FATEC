package fatecfranca.lista1;

public class Lista1 {

    public static void main(String[] args) {
        
        // criando os objetos da classe produto
        // () indica a chamada de um método, especial chamado construtor
        // método tem o mesmo nome da classe
        
        Produto obj1 = new Produto(1,"Camiseta estampada","Camiseta",21.99f,10,false); // método construtor, passagem de parametros
        
        // toda classe em Java recebe um pacote chamado java.lang, e esse pacote possui varias classes
            
       obj1.mostrarObjeto(); //chamamento do objeto irá trazer a classe e seus valores
       obj1.compraObjeto(3);
       obj1.venderObjeto(6);
       obj1.aumentarPreco(10);
       obj1.diminuirPreco(102);
       obj1.mostrarObjeto();
       
        Produto obj2 = new Produto(2,"Calça Jeans Estampada","Calça",34.99f,15,false); // método construtor, passagem de parametros
        
        obj2.mostrarObjeto(); //chamamento do objeto irá trazer a classe e seus valores
        obj2.compraObjeto(6);
        obj2.venderObjeto(3);
        obj2.aumentarPreco(10);
        obj2.diminuirPreco(25);
        obj2.mostrarObjeto();
        
        // toda classe em Java recebe um pacote chamado java.lang, e esse pacote possui varias classes

    }
    }