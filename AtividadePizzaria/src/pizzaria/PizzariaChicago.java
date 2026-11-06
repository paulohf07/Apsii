package pizzaria;

public class PizzariaChicago extends LojaPizzas {

    protected Pizza criarPizza(String item) {

        Pizza pizza = null;

        FabricaIngredientesPizza fabricaIngredientes =
                new FabricaIngredientesChicago();

        if (item.equals("queijo")) {

            pizza = new PizzaQueijo(fabricaIngredientes);

            pizza.definirNome("Pizza de Queijo no Estilo de Chicago");

        } else if (item.equals("vegetariana")) {

            pizza = new PizzaVegetariana(fabricaIngredientes);

            pizza.definirNome("Pizza Vegetariana no Estilo de Chicago");

        } else if (item.equals("mariscos")) {

            pizza = new PizzaMariscos(fabricaIngredientes);

            pizza.definirNome("Pizza de Mariscos no Estilo de Chicago");

        } else if (item.equals("calabresa")) {

            pizza = new PizzaCalabresa(fabricaIngredientes);

            pizza.definirNome("Pizza de Calabresa no Estilo de Chicago");
        }

        return pizza;
    }
}