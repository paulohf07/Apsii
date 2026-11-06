package pizzaria;

public class PizzaVegetariana extends Pizza {

    FabricaIngredientesPizza fabricaIngredientes;

    public PizzaVegetariana(FabricaIngredientesPizza fabricaIngredientes) {

        this.fabricaIngredientes = fabricaIngredientes;
    }

    void preparar() {

        System.out.println("Preparando " + nome);

        massa = fabricaIngredientes.criarMassa();

        molho = fabricaIngredientes.criarMolho();

        queijo = fabricaIngredientes.criarQueijo();

        vegetais = fabricaIngredientes.criarVegetais();
    }
}