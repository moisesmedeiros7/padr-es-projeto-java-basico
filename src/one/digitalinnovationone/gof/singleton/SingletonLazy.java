package one.digitalinnovationone.gof.singleton;
/**
 * Singleton "preguiçoso"
 * @author @moisesmedeiros7
 */

public class SingletonLazy {
   // instância STATIC
    private static SingletonLazy instancia;

    //construtor PRIVADO
    private SingletonLazy() {
        super();
    }

    // método que dá acesso a instância. Obs:instância precisa ser iniciada
    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }


}
