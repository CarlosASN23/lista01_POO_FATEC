package fatecfranca.exercicio01;

// criação da classe Aluno
// através do método public as variaveis poderão ser acessadas por outra classe

public class Aluno{
    
   public int numeroAluno;
   public String nome;
   public int idade;
   public float p1;
   public float p2;
    
    // criação do construtor e das variaveis de passagem de parâmetro
    public Aluno(int numeroAluno,String nome,int idade,float p1, float p2){
        
        this.numeroAluno=numeroAluno;
        this.nome=nome;
        this.idade=idade;
        this.p1=p1;
        this.p2=p2;
    }
    // método para informar o valor da média final do aluno
    public float mediaFinal(){
        
        return (this.p1+this.p2)/2;
        
    }
    
    // método para imprimir os dados do aluno
    public String dadosAluno(){
        
        return("\n Numero do Aluno:" + this.numeroAluno + 
                "\n Nome: " + this.nome + "\n Idade: " + this.idade + "\n Média Final: "+ this.mediaFinal()
                + "\n Você foi " + this.passou());
        
    }
    
    // método para verificar se o Aluno foi aprovado ou não de acordo com a média final
    public String passou(){
        
        return (this.mediaFinal()>= 6)?
        "Aprovado" : "Reprovado";
        }
    }

