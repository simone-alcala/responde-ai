public class Estudante {

  private String nome;
  private Long cpf;

  public Estudante() {
  }

  public Estudante(String nome, Long cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome.toUpperCase();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "Nome: " + getNome() + " - CPF: " + getCpf();
  }

}
