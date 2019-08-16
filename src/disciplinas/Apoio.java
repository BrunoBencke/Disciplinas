package disciplinas;

import java.util.*;

/**
 *
 * @author bruno.bencke
 */
public class Apoio {

    HashMap<Integer, String> prof = new HashMap<Integer, String>();
    HashMap<Integer, String> turnos = new HashMap<Integer, String>();
    HashMap<Integer, String> disciplinas = new HashMap<Integer, String>();
    
    //String arrayProfessores[] = {"Evandro", "Marcelo", "Fabricio", "Mouriac", "Alexandre", "Luiz"};
    //String arrayTurnos[] = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta"};
    //String arrayDisciplinas[] = {"Algoritmos", "Poo", "Bd", "Estrtura", "IA","Modelagem","Grafica","Compiladores","PI"};

    public String[] geraPopulacao(int numPopulacao, int geracoes) {
        
        prof.put(1, "Evandro");
        prof.put(2, "Marcelo");
        prof.put(3, "Fabricio");
        prof.put(4, "Mouriac");
        prof.put(5, "Alexandre");
        prof.put(6, "Luiz");
        
        turnos.put(1, "Segunda");
        turnos.put(2, "Terca");
        turnos.put(3, "Quarta");
        turnos.put(4, "Quinta");
        turnos.put(5, "Sexta");
        
        disciplinas.put(1, "Algoritmos");
        disciplinas.put(2, "Poo");
        disciplinas.put(3, "Bd");
        disciplinas.put(4, "Estrutura");
        disciplinas.put(5, "IA");
        disciplinas.put(6, "Modelagem");
        disciplinas.put(7, "Grafica");
        disciplinas.put(8, "Compiladores");
        disciplinas.put(9, "PI");
            
        String array[] = new String[numPopulacao];
        
        for (int i = 0; i < numPopulacao; i++) {
            // gera números aleatórios de 1 à 9. DISCIPLINA
            int disciplina = 1 + (int) (Math.random() * 9);
            // gera números aleatórios de 1 à 6. professor
            int professor = 1 + (int) (Math.random() * 6);
            // gera números aleatórios de 1 à 5. turno
            int turno = 1 + (int) (Math.random() * 5);

            array[i] = ""+disciplina+""+professor+""+turno;
            
        }      
        
        
        return array;
    }

}
