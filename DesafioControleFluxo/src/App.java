import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro numero");
    int Numero1 = scanner.nextInt();

    System.out.println("Digite o segundo numero");
    int Numero2 = scanner.nextInt();

    try {
        contar(Numero1, Numero2);
    } catch (ParametrosInvalidosException e) {
        System.out.println("Segundo numero menor que o primeiro");
    } finally{

    }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }
            int conta = num2 - num1;
            for(int num = 0; num <= conta; num++){
                System.out.print("Imprimindo o número " + num);
                System.out.println("\n");
            }
    
    }
}
