package disciplinas;

/**
 *
 * @author Bruno Bencke
 */
public class Disciplina {
    
    private int fitnessValue;
    private int codDisciplina;
    private int codProfessor;
    private int turno;

    public Disciplina(int codDisciplina, int codProfessor, int turno) {
        this.codDisciplina = codDisciplina;
        this.codProfessor = codProfessor;
        this.turno = turno;
        this.fitnessValue = fitness();
    }
    
    public static int fitness() {
        // desenvolver fitness - avalia numero gerado de 0 a 10 classificando com if
        int fitness = 5;
        
        

        return fitness;
    }    
    
    public String toString(){
        return codDisciplina+""+codProfessor+""+turno+" Fitness: "+fitnessValue;
    }

    public int getFitnessValue() {
        return fitnessValue;
    }

    public void setFitnessValue(int fitnessValue) {
        this.fitnessValue = fitnessValue;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
