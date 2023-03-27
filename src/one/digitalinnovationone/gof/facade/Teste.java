package one.digitalinnovationone.gof.facade;

public class Teste {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }

}

/**
 * O Padrão de Projeto Facade oculta toda a complexidade de uma ou mais classes através de
 * uma Facade (Fachada). A intenção desse Padrão de Projeto é simplificar uma interface.
 * Existem outros dois Padrões de Projetos (Decorator e Adapter) já discutidos em outros
 * artigos que possuem similaridades com o Padrão Facade, porém existem diferenças em relação
 * a este padrão, como será visto mais adiante.
 *
 * Com o Padrão Facade podemos simplificar a utilização de um subsistema complexo apenas
 * implementando uma classe que fornece uma interface única e mais razoável, porém se desejássemos
 * acessar as funcionalidades de baixo nível do sistema isso seria perfeitamente possível.
 * É importante ressaltar que o padrão Facade não “encapsula” as interfaces do sistema, o padrão
 * Facade apenas fornece uma interface simplificada para acessar as suas funcionalidades.
 * Imagine que existe um sistema com diversas classes contendo diversos métodos e tenhamos que agrupar
 * todas essas classes chamando diversos métodos para realizar uma determinada operação.
 * Tendo uma Facade precisaríamos apenas construir um método que agrupe todas essas classes e chame
 * todos esses métodos. Assim, quando usuário quiser fazer essa operação ele chamaria apenas a Facade
 * que realizaria essa operação, simplificando muito todo o processo com uma simples interface.
 * Vale ressaltar que isso não significa que uma Facade não tenha também funcionalidades próprias,
 * ou seja, que tenha a sua própria inteligência e também utilize o subsistema. Um subsistema pode
 * ter diversos Facades.
 *
 * A definição oficial do padrão Facade é: “O Padrão Facade fornece uma interface unificada para um conjunto
 * de interfaces em um subsistema. O Facade define uma interface de nível mais alto que facilita a utilização
 * do subsistema”.
 */