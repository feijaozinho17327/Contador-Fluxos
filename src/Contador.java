import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        if (parametroDois < parametroUm) {

            throw new ParametrosInvalidosException("Parametro 1 maior que o parametro 2");

        }

        for(int i=1; i<contagem + 1 ; i++) {

            System.out.println(i);

        }

    }
}