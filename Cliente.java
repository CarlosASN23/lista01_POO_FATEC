package fatecfranca.exercicio02;

// criação da classe Cliente e das variaveis de instancias
public class Cliente {
    
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    // criação dos construtores e realização da passagem de atributos
    public Cliente (int numeroConta, int numeroAgencia, String nome,float saldo){
        
        this.numeroConta=numeroConta;
        this.numeroAgencia=numeroAgencia;
        this.nome=nome;
        this.saldo=saldo;
        
    }
    // método para realização da operação de deposito
    public void realizarDeposito(int x){
        
        this.saldo = this.saldo + x;
        System.out.println("Deposito realizado com sucesso!");
    }
    // método para a realização da operação de saque
    public void realizarSaque(int x){
        
        if(this.saldo>=x){
            
            this.saldo = this.saldo - x;
            System.out.println("Saque realizado com sucesso!");
        } else{
            
            System.out.println("Não foi possivel realizar o saque!");
        }
    }
    
    public void extrato(){
        
        System.out.println("""
                           
                            ===== Extrato ====
                             Ag\u00eancia: """ + this.numeroAgencia
        + "\n Numero da conta: " + this.numeroConta + "\n Nome do cliente: "+ this.nome +
          "\n Saldo: R$" + this.saldo + "\n ==== ||||||| ====");
        
    }
    
    
}
