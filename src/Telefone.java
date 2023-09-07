public interface Telefone {
    public default void ligar(){
        System.out.println("LIGANDO");
    }
    public default void atender(){
        System.out.println("ATENDENDO");
    }
    public default void iniciarCorreioDeVoz(){
        System.out.println("CORREIO DE VOZ");
    }
}