package pizzaria;

public class PizzaCalabresa extends Pizza {

    FabricaIngredientesPizza fabricaIngredientes;

    public PizzaCalabresa(FabricaIngredientesPizza fabricaIngredientes) {

        this.fabricaIngredientes = fabricaIngredientes;
    }

    void preparar() {

        System.out.println("Preparando " + nome);

        massa = fabricaIngredientes.criarMassa();

        molho = fabricaIngredientes.criarMolho();

        queijo = fabricaIngredientes.criarQueijo();

        calabresa = fabricaIngredientes.criarCalabresa();
    }
}