import javax.swing.*;

public class exercicio10 { //inicio algoritmo

    static public double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static public int ano = 1;

    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira  um valor inteiro"));

        while (ano <= 10) {
            valorJuros =  (valorInvestimento * taxaJuros) + valorJuros;
            ano++;
        }
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investido R$" + valorInvestimento);
        System.out.println("Valor Juros R$" + valorJuros);
        System.out.println("Valor total com juros R$" + valorTotal);
    }
} //fim de algoritmo
