public interface Música {
    public default void tocar(){
        System.out.println("TOCANDO");
    }
    public default void pausar(){
        System.out.println("PAUSANDO");
    }
    public default void reproduzirMusica(){
        System.out.println("REPRODUZINDO");
    }
}