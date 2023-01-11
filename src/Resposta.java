public class Resposta {
  
  private String descricao;
  private Questao questao;

  public Resposta() { }
  
  public Resposta(String descricao, Questao questao) {
    this.descricao = descricao;
    this.questao = questao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Questao getQuestao() {
    return questao;
  }

  public void setQuestao(Questao questao) {
    this.questao = questao;
  }

  @Override
  public String toString() {
    return "Questão: " + questao.getDescricao() + "\nResposta: " + getDescricao();
  }

}
