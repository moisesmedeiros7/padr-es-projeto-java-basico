package one.digitalinnovationone.gof.singleton;
/**
 * Singleton "apressado"
 * @author @moisesmedeiros7
 */
public class SingletonEager {
    // instância STATIC
    private static SingletonEager instancia = new SingletonEager();

    //construtor PRIVADO
    private SingletonEager() {
        super();
    }

    // método que dá acesso a instância. Obs:instância já foi iniciada
    public static SingletonEager getInstance(){
        return instancia;
    }
}



