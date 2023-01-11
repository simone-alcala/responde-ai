import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {

            Disciplina disciplina1 = new Disciplina("Cálculo I");
            Disciplina disciplina2 = new Disciplina("Cálculo II");
            
            Questao questao1 = new Questao("Questão 1") ;
            Questao questao2 = new Questao("Questão 2") ;
    
            questao1.adicionarDisciplina(disciplina1);
            questao2.adicionarDisciplina(disciplina2);
    
            Resposta resposta1 = new Resposta("Resposta1", questao1);
            Resposta resposta2 = new Resposta("Resposta2", questao2);
         
            System.out.print("Digite o nome do estudante: ");
            String nome = sc.nextLine();
    
            System.out.print("Digite o CPF do estudante (Sem ponto ou traço): ");
            Long cpf = sc.nextLong();
    
            System.out.println();
    
            Estudante estudante = new Estudante(nome, cpf);
    
            System.out.println("Digite o código da disciplina:");
            System.out.println("1 - Cálculo I \n2 - Cálculo II");
            int codigoDisciplina = sc.nextInt();
            
            if (codigoDisciplina != 1 &&  codigoDisciplina != 2) {
                throw new InputMismatchException();
            }
    
            System.out.println(estudante + " selecionou " + disciplina1.getNome() + ":");
            if (codigoDisciplina == 1) {
                System.out.println(resposta1);
            } else {
                System.out.println(resposta2);
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        } catch (Exception e) {
            System.out.println("Deu ruim");
        } finally {
            sc.close();
        }


    }
}

