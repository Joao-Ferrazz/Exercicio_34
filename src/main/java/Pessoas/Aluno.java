package Pessoas;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    public static final String CURSO_DEFAULT = "Engenharia da Computação";
    private String curso;

    public Aluno() {
        this.curso = CURSO_DEFAULT;
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void leitura() {
        super.leitura();
        curso = JOptionPane.showInputDialog("Digite o curso:", CURSO_DEFAULT);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Curso: " + curso);
    }

    @Override
    public String getNomeFormatado() {
        return getNome().toUpperCase();
    }
}
