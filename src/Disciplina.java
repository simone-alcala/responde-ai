public class Disciplina {
  
  private String nome;

  public Disciplina() { }

  public Disciplina(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome.toUpperCase();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
}
