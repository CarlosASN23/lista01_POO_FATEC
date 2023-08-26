package fatecfranca.exercicio01;

public class TestaAluno {

    public static void main(String[] args) {
    
    // instanciar o construtor com paramêtros
    Aluno aluno01 = new Aluno(1,"Gustavo",20,8.66f,7.55f);
    
    System.out.println(aluno01.dadosAluno()); // chamamento neste método é melhor por ser aplicavel em mobile
    
    }
          
}
