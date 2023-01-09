package visitor;

public interface Visitor {
	String exibirMapaCidade(Cidade cidade);
	String exibirMapaEstado(Estado estado);
    String exibirMapaPais(Pais pais);
}
