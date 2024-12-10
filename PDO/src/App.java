import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    Pessoa pessoa = new Pessoa(null, 0);
    Pessoa Juridica = new Juridico("Teste", 0);

    Juridica.DadosAll();

    System.out.println("Nome: " + Juridica.GetNome());
    JOptionPane.showMessageDialog(null, "Nome: " + Juridica.GetNome());
    }
}
