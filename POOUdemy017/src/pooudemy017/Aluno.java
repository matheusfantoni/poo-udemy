package pooudemy017;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    

    public double calculaNotaAluno() {

        return nota1 + nota2 + nota3;
    }

    public double pontosPerdidos() {

        if (calculaNotaAluno() < 60) {
            
            return 60 - calculaNotaAluno();
        }
        else{
            return 0.0;
        }
    }

}
