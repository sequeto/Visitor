package visitor;

public class Cidade implements Local{
	private String nome;
	
	public Cidade(String nome) {
		this.setNome(nome);
	}
	
	public String aceitar(Visitor visitor) {
        return visitor.exibirMapaCidade(this);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
