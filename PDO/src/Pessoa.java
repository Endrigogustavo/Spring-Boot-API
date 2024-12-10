import javax.swing.JOptionPane;

public class Pessoa {
 private String Nome;
 private int Idade;

public Pessoa( String nome, int idade) {
    this.Nome = nome;
    this.Idade = idade;
}

public String GetNome(){
    return Nome;
}

public void SetNome(String nome){
    this.Nome = nome;
}

public int GetIdade(){
    return Idade;
}

public void SetIdade(int idade){
    this.Idade = idade;
}


public void DadosAll(){
    this.SetNome(JOptionPane.showInputDialog("Digite seu nome"));
    this.SetIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));

    JOptionPane.showMessageDialog(null,"Nome: " + GetNome());
}
}


class Juridico extends Pessoa{

    private String tipo = "Juridica";

    public Juridico(String Nome, int Idade){
        super(Nome, Idade);
    }

    @Override
    public void DadosAll(){
        super.DadosAll();
        JOptionPane.showMessageDialog(null,"Tipo: " + tipo);
    }
}
 