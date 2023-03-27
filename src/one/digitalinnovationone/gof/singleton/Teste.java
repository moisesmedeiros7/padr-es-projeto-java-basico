package one.digitalinnovationone.gof.singleton;

import one.digitalinnovationone.gof.singleton.SingletonEager;
import one.digitalinnovationone.gof.singleton.SingletonLazy;
import one.digitalinnovationone.gof.singleton.SingletonLazyHolder;

public class Teste {
    public static void main(String[] args) {
        /**
         * Testes para verfiricar o Design Pattern Singleton
         */

        //SingletonLazy lazy = new SingletonLazy(); //Não permite NEW
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // As saidas vão mostrar objetos com o mesmo endereço de memória: O mesmo objeto!
    }
}

/**
 * O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância
 * de si mesma e que forneça um ponto global de acesso a ela. Ou seja, uma classe gerencia a
 * própria instância dela além de evitar que qualquer outra classe crie uma instância dela.
 *
 * Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe
 * pode instanciar ela. O Padrão Singleton também oferece um ponto global de acesso a sua instância.
 * A própria classe sempre vai oferecer a própria instância dela e caso não tenha ainda uma instância,
 * então ela mesma cria e retorna essa nova instância criada.
 */
