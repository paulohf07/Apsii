package pizzaria;

public class PizzariaNovaYork extends LojaPizzas {

    protected Pizza criarPizza(String item) {

        Pizza pizza = null;

        FabricaIngredientesPizza fabricaIngredientes =
                new FabricaIngredientesNovaYork();

        if (item.equals("queijo")) {

            pizza = new PizzaQueijo(fabricaIngredientes);

            pizza.definirNome("Pizza de Queijo no Estilo de Nova York");

        } else if (item.equals("vegetariana")) {

            pizza = new PizzaVegetariana(fabricaIngredientes);

            pizza.definirNome("Pizza Vegetariana no Estilo de Nova York");

        } else if (item.equals("mariscos")) {

            pizza = new PizzaMariscos(fabricaIngredientes);

            pizza.definirNome("Pizza de Mariscos no Estilo de Nova York");

        } else if (item.equals("calabresa")) {

            pizza = new PizzaCalabresa(fabricaIngredientes);

            pizza.definirNome("Pizza de Calabresa no Estilo de Nova York");
        }

        return pizza;
    }
}