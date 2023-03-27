package one.digitalinnovationone.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * @author @moisesmedeiros7
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    //construtor PRIVADO
    private SingletonLazyHolder() {
        super();
    }
    // Acesso através de método.instancia
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
