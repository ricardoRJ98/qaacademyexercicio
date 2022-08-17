import javax.swing.*;

public class exercicio_09_medium {

    static int i = 0;
    public static void main(String[] args) {

        String [] nomeAlunosVetor = new String[5];
        int [] numeroAlunosVetor = new int [5];

        while(i < 5){

            nomeAlunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do aluno");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
            i++;
        }
        i=0;

        while(i < 5){
            System.out.println("nome do aluno: "+ nomeAlunosVetor[i] + " - numero do aluno: " + numeroAlunosVetor[i]);
            i++;
        }
    }
}