package pessoa;

import javax.swing.JOptionPane;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void leitura() {
        nome = JOptionPane.showInputDialog("Digite o nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
    }

    public abstract String getNomeFormatado();
}
