package estruturaRepeticao;

public class exemplo1 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia","Odirlei","Jessica","Thiago"};

        for (int contador = 0; contador < listaProfessores.length ; contador++) {

            if (contador == 0) {
                System.out.println("O numero do(a) professor(a)" +
                        listaProfessores[contador] + "é Zero");
            } else if (contador % 2== 0) {
                System.out.println("O numero do(a) professor(a)" +
                        listaProfessores[contador] + "é Par");

            }else {
                System.out.println("O numero do(a) professor(a)" +
                        listaProfessores[contador] + "é Impar");
            }
        }
    }
}
