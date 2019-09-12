package disciplinas;

import java.util.ArrayList;

public class Populacao {

    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public ArrayList<Disciplina> geraPopulacao(int numPopulacao, int geracoes, int turnos, int professores, int disc) {

        for (int i = 0; i < geracoes; i++) {
            for (int j = 0; j < numPopulacao; j++) {
                int[] dados = geraDados(disc, professores, turnos);
                Disciplina disciplina = new Disciplina(dados[0], dados[1], dados[2]);
                disciplinas.add(disciplina);
            }
        }
        set_fitness(disciplinas);
        return disciplinas;
    }

    private int[] geraDados(int disc, int prof, int turn) {

        int[] vetor = new int[3];

        // gera números aleatórios de 1 à Num Escolhido. DISCIPLINA
        vetor[0] = 1 + (int) (Math.random() * disc);
        // gera números aleatórios de 1 à Num Escolhido. professor
        vetor[1] = 1 + (int) (Math.random() * prof);
        // gera números aleatórios de 1 à Num Escolhido. turno
        vetor[2] = 1 + (int) (Math.random() * turn);

        return vetor;
    }

    private void set_fitness(ArrayList<Disciplina> disciplinas) {
        // desenvolver fitness - avalia numero gerado de 0 a 10 classificando com if
        int fitness = 10;
        for (int i = 0; i < disciplinas.size(); i++) {
//            if (disciplinas.get(i).getCodDisciplina()) {
//
//            }            if (disciplinas.get(i).getCodDisciplina()) {
//
        }
    }

//    public static Populacao bestSelection(Vector<Populacao> Disciplinass) {
//        Populacao min = Disciplinass.firstElement();
//        for (Populacao Disciplinas : Disciplinass) {
//            if (Disciplinas.fitnessValue < min.fitnessValue) {
//                min = Disciplinas;
//            }
//        }
//        return min;
//    }   
}
