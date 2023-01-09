package visitor;

public class Pais implements Local{
	private String nome;
	
	public Pais(String nome) {
		this.setNome(nome);
	}
	
	public String aceitar(Visitor visitor) {
        return visitor.exibirMapaPais(this);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
