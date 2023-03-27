package one.digitalinnovationone.gof.strategy;

    // Testes do Strategy
public class Teste {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}

/**
 * A lógica condicional é uma das estruturas mais complexas e utilizadas no desenvolvimento
 * de softwares corporativos. Lógicas condicionais tendem a crescer e tornar-se cada vez mais
 * sofisticadas, maiores e mais difíceis de manter com o passar do tempo. O padrão Strategy
 * ajuda a gerenciar toda essa complexidade imposta pelas lógicas condicionais. O Padrão Strategy
 * sugere que se produza uma família de classes para cada variação do algoritmo e que se forneça
 * para a classe hospedeira uma instância de Strategy para a qual ela delegará em tempo de execução.
 *
 * Um dos pré-requisitos para o Strategy é uma estrutura de herança onde cada subclasse específica
 * contém uma variação do algoritmo. Assim, o padrão Strategy possui diversos benefícios como clarificar
 * algoritmos ao diminuir ou remover lógica condicional, simplificar uma classe ao mover variações de um
 * algoritmo para uma hierarquia, e habilitar um algoritmo para ser substituído por outro em tempo de execução.
 */