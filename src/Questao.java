import java.util.ArrayList;
import java.util.List;

public class Questao {

  private String descricao;
  private List<Disciplina> disciplinas = new ArrayList<>();

  public Questao() { }

  public Questao(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public void adicionarDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
  }

  public void removerDisciplina(Disciplina disciplina) {
    disciplinas.remove(disciplina);
  }

}
