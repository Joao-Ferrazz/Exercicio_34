package principal;

import pessoas.Aluno;
import pessoas.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.leitura();
        aluno.imprimir();
        System.out.println("Nome formatado: " + aluno.getNomeFormatado());

        Professor professor = new Professor();
        professor.leitura();
        professor.imprimir();
        System.out.println("Nome formatado: " + professor.getNomeFormatado());
    }
}
