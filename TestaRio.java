
package fatecfranca.exercicio04;
public class TestaRio {

    public static void main(String[] args) {
        
        // chamamento do objeto utilizando o método construtor ser parâmetros
        Rio obj1 = new Rio();
        obj1.nome = "Rio grande";
        obj1.chover(2);
        obj1.poluir();
        System.out.println(obj1.mostra());
        
        // chamamento de objeto utilizando o método construtor com parâmetros
        Rio obj2 = new Rio ("Nilo",5,true);
        
        System.out.println(obj2.mostra());
}
}