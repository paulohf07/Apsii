package pizzaria;

public class PizzaQueijo extends Pizza {

    FabricaIngredientesPizza fabricaIngredientes;

    public PizzaQueijo(FabricaIngredientesPizza fabricaIngredientes) {

        this.fabricaIngredientes = fabricaIngredientes;
    }

    void preparar() {

        System.out.println("Preparando " + nome);

        massa = fabricaIngredientes.criarMassa();

        molho = fabricaIngredientes.criarMolho();

        queijo = fabricaIngredientes.criarQueijo();
    }
}