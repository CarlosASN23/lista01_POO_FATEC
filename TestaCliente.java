package fatecfranca.exercicio02;

public class TestaCliente {

    public static void main(String[] args) {
        
        // passagem de parâmetros método construtor
        Cliente cliente01 = new Cliente (01,001,"Rafaela Gomes",0f);
        
        
        // execução dos métodos public
        cliente01.extrato();
        cliente01.realizarDeposito(200);
        cliente01.realizarSaque(50);
        cliente01.extrato();
        
        Cliente cliente02 = new Cliente(02,002,"Reginaldo Arantes",0f);
        
        cliente02.extrato();
        cliente02.realizarDeposito(400);
        cliente02.realizarSaque(195);
        cliente02.extrato();
    }
}
