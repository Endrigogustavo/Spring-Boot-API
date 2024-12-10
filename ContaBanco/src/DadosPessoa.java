import java.util.Scanner;

class DadosPessoa {
    Scanner scanner = new Scanner(System.in);

    
    private int Numero;
    private int Agencia;
    private String NomeCompleto;
    private Double Saldo;

    
    public DadosPessoa(int numero, int agencia, String nome, double saldo){
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCompleto = nome;
        this.Saldo = saldo;
    }

    public int GetNumero(){
        return Numero;
    }
    public void SetNumero(int numero){
        this.Numero = numero;
    }


    public String GetNomeCompleto(){
        return NomeCompleto;
    }
    public void SetNomeCompleto(String nome){
        this.NomeCompleto = nome;
    }


    public int GetAgencia(){
        return Agencia;
    }
    public void SetAgencia(int agencia){
        this.Agencia = agencia;
    }


    public double GetSaldo(){
        return Saldo;
    }
    public void SetSaldo(double saldo){
        this.Saldo = saldo;
    }

    public void Cadastro(){
        System.out.println("Digite o Numero da conta: ");
        int num = scanner.nextInt();
        this.SetNumero(num);

        System.out.println("Digite o Numero da Agencia: ");
        int age = scanner.nextInt();
        this.SetAgencia(age);

        System.out.println("Digite o seu nome completo: ");
        String nome = scanner.next();
        this.SetNomeCompleto(nome);

        System.out.println("Digite o saldo atual: ");
        double sal = scanner.nextDouble();
        this.SetSaldo(sal);
    }

    public void ConsultarDados(){
        System.out.println("Olá " + GetNomeCompleto() +", obrigado por criar uma conta em nosso banco, sua agência é " + GetAgencia() +", conta " + GetNumero()+ " e seu saldo " + GetSaldo() + " já está disponível para saque.");
    }
}

