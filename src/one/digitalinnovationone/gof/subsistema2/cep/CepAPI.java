package one.digitalinnovationone.gof.subsistema2.cep;

import one.digitalinnovationone.gof.singleton.SingletonEager;

public class CepAPI {
    // instância STATIC
    private static CepAPI instancia = new CepAPI();

    //construtor PRIVADO
    private CepAPI() {
        super();
    }

    // método que dá acesso a instância. Obs:instância já foi iniciada
    public static CepAPI getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep ){
        return "Ipueira";
    }
    public String recuperarEstado(String cep ){
        return "RN";
    }

}
