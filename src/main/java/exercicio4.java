import javax.swing.*;

public class exercicio4 { //Inicio Algoritmo
    static int numeroDigitado, resultado;

    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero que sera multiplicado: "));
        resultado = numeroDigitado * 2;
        System.out.println ("O dobro do valor digitado é :" + resultado);

    }
}
