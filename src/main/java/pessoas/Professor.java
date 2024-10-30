package pessoas;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    public static final String TITULO_DEFAULT = "Doutor";
    private double salario;
    private String titulo;

    public Professor() {
        this.titulo = TITULO_DEFAULT;
    }

    public Professor(String nome, int idade, double salario, String titulo) {
        super(nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void leitura() {
        super.leitura();
        titulo = JOptionPane.showInputDialog("Digite o título:", TITULO_DEFAULT);
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Título: " + titulo + "\nSalário: " + salario);
    }

    @Override
    public String getNomeFormatado() {
        return titulo + " " + getNome();
    }
}
