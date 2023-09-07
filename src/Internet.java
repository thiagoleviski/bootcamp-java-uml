public interface Internet {
    public default void exibirPagina(){
        System.out.println("EXIBINDO");
    }
    public default void adicionarNovaAba(){
        System.out.println("ADICIONANDO");
    }
    public default void atualizarNovaPagina(){
        System.out.println("ATUALIZANDO");
    }
}
