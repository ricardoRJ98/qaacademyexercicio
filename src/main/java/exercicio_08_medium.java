public class exercicio_08_medium {

    static int i=0;
    public static void main(String[] args){

        String vetorMeses[] = new String [12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        while(i < 12){
            System.out.println(" O mes : " + (i+1) + " - " + vetorMeses[i]);
            i++;
        }

    }
}
