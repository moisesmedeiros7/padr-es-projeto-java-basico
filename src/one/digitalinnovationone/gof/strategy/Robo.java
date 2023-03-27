package one.digitalinnovationone.gof.strategy;

public class Robo {
    // atributo do tipo da interface
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
