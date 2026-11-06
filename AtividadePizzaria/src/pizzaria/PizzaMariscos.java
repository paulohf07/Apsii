package pizzaria;

public class PizzaMariscos extends Pizza {

    FabricaIngredientesPizza fabricaIngredientes;

    public PizzaMariscos(FabricaIngredientesPizza fabricaIngredientes) {

        this.fabricaIngredientes = fabricaIngredientes;
    }

    void preparar() {

        System.out.println("Preparando " + nome);

        massa = fabricaIngredientes.criarMassa();

        molho = fabricaIngredientes.criarMolho();

        queijo = fabricaIngredientes.criarQueijo();

        marisco = fabricaIngredientes.criarMarisco();
    }
}