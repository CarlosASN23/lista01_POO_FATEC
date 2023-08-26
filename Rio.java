
package fatecfranca.exercicio04;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    // construção do construtor sem parâmetro 
   public Rio(){
       
   }
   
   // Criação do construtor com parâmetro
   public Rio(String nome, float nivel, boolean poluido){
       
       this.nome = nome;
       this.nivel = nivel;
       this.poluido = poluido;
   }
   
   // método para criar a função poluir
   public void poluir(){
       this.poluido=true;
   }
   
   // método para criar a função limpar
   public void limpar(){
       this.poluido = false;   
   }
   
   // método para criar a função chover
   public void chover(float x){
       this.nivel = this.nivel + x;
   }
   
   // método para criar a função ensolarado
   public void ensolarado(float x){
       if (x<=this.nivel){
       this.nivel -=x;
   }else{
           this.nivel = 0;
       }
   }
   
   // método para criar a função mostrar
   public String mostra(){
       return "\n Nome: " + this.nome + "\n Nivel: " + this.nivel +
               ((this.poluido)? "\n Sim" : "\n Não");
}
}

