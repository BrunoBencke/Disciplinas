package disciplinas;

import java.util.*;

/**
 *
 * @author bruno.bencke
 */
public class Apoio {

    HashMap<Integer, String> prof = new HashMap<Integer, String>();
    HashMap<Integer, String> turno = new HashMap<Integer, String>();
    HashMap<Integer, String> disciplina = new HashMap<Integer, String>();
    
    public Apoio(){
        prof.put(1, "Evandro");
        prof.put(2, "Marcelo");
        prof.put(3, "Fabricio");
        prof.put(4, "Mouriac");
        prof.put(5, "Alexandre");
        prof.put(6, "Luiz");
        
        turno.put(1, "Segunda");
        turno.put(2, "Terca");
        turno.put(3, "Quarta");
        turno.put(4, "Quinta");
        turno.put(5, "Sexta");
        
        disciplina.put(1, "Algoritmos");
        disciplina.put(2, "Poo");
        disciplina.put(3, "Bd");
        disciplina.put(4, "Estrutura");
        disciplina.put(5, "IA");
        disciplina.put(6, "Modelagem");
        disciplina.put(7, "Grafica");
        disciplina.put(8, "Compiladores");
        disciplina.put(9, "PI");
    }
    
    public String[] geraPopulacao(int numPopulacao, int geracoes, int turnos, int professores, int disciplinas) { 
                    
        String array[] = new String[numPopulacao];
        
        for (int i = 0; i < numPopulacao; i++) {                
            array[i] = geraDados(disciplinas, professores, turnos);
            for (int j = 0; j < i; j++) {
                if (array[j].equalsIgnoreCase(array[i])) {
                    System.out.println("resultado identico detectado");
                }
            }
        }
        return array;
    }
    
    public String geraDados(int disc, int prof, int turn){
        // gera números aleatórios de 1 à Num Escolhido. DISCIPLINA
        int disciplina = 1 + (int) (Math.random() * disc);
        // gera números aleatórios de 1 à Num Escolhido. professor
        int professor = 1 + (int) (Math.random() * prof);
        // gera números aleatórios de 1 à Num Escolhido. turno
        int turno = 1 + (int) (Math.random() * turn);

        String resultado = "0" + disciplina + "0" + professor + "0" + turno;
        return resultado;
    }

}
