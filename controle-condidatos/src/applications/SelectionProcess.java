package applications;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**Classe para o processo seletivo, onde vai comparar o salário oferecido pela empresa com o salário pedido pelos candidatos.
 * @author Fellipe M Dino
 * @version 1.0
 * @since 20 set 20023
 */

public class SelectionProcess {
    public static void main(String[] args) {
        String[] candidates = {"John", "Emily", "Michael", "Sophia", "Daniel"};
        for (String candidate: candidates) {
            gettingInTouch(candidate);
        }
    }

    /** Método para saber se os candidatos atenderam ao contato ou não*/
    static void gettingInTouch(String candidate) {
        int tried = 1;
        boolean continueToTry = true;
        boolean answered = false;

        do {
            answered = answer();
            continueToTry = !answered;

            if (continueToTry) {
                tried++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continueToTry && tried < 3);

        if (answered) {
            System.out.println("Conseguimos contato com " + candidate + " na " + tried + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidate);
        }
    }

    /** Método auxiliar para dizer se o candidato ligou ou não
     * @return Boolean - true ou false */
    static boolean answer() {
        return new Random().nextInt(3)==1;
    }

    /** Método para listar os candidatos selecionados*/
    static void showCandidates() {
        String[] candidates = {"John", "Emily", "Michael", "Sophia", "Daniel"};
        System.out.println("Imprimindo a lista de canditados informando o indice do elemento");

        for (String candidate: candidates){
            System.out.println("O candidato selecionado foi " + candidate);
        }
    }

    /** Método para selecionar os candidatos baseado no valor do salário*/
    static void selectionCandidates(){
        String[] candidates = {"John", "Emily", "Michael", "Sophia", "Daniel", "Olivia", "David", "Emma", "Matthew", "Ava"};

        int selectedCandidates = 0;
        int atualCandidate = 0;
        double baseSalary = 2000.0;
        while (selectedCandidates < 5 && atualCandidate < candidates.length) {
            String candidate = candidates[atualCandidate];
            double candidateSalary = randomSalary();

            System.out.println("O candidato " + candidate + " solicitou este valor de salário: " + candidateSalary);
            if (baseSalary > candidateSalary) {
                System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
                selectedCandidates++;
            }
            atualCandidate++;
        }
    }

    /** Método para retorno do salário do candidato
     * @return Double - Valor do Salário */
    private static double randomSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    /** Método comparar os candidatos para quem ira ser feito a ligação baseado no valor do salário*/
    static void analyzeCandidate(double candidateSalary) {
        double baseSalary = 2000.0;
        if (baseSalary > candidateSalary) System.out.println("Ligar para o Candidato");
        else if(baseSalary == candidateSalary) System.out.println("Ligar para o candidato com outra proposta");
        else System.out.println("Aguardando o resultado dos demais candidatos");
    }
}
