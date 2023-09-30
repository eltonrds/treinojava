package estruturaRepeticao;

public class exemplo3 {
    public static void main(String[] args) throws InterruptedException {

        String[] listaCarros = {"fusca", "civic", "g3", "Maverick"};

        for (String cadaCarro: listaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);
        }
    }
}
