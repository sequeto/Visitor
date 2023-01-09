package visitor;

public class Estado implements Local{
	private String nome;
	
	public Estado(String nome) {
		this.setNome(nome);
	}
	
	public String aceitar(Visitor visitor) {
        return visitor.exibirMapaEstado(this);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
