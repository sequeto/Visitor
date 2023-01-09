package visitor;

public class LocalVisitor implements Visitor{
	public String exibir(Local local) {
        return local.aceitar(this);
    }

    public String exibirMapaCidade(Cidade cidade) {
        return "Mapa da cidade " + cidade.getNome();
    }

    public String exibirMapaEstado(Estado estado) {
        return "Mapa do estado " + estado.getNome();
    }

    public String exibirMapaPais(Pais pais) {
        return "Mapa do País " + pais.getNome();
    }
}
