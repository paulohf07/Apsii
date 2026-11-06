package pizzaria;

public abstract class LojaPizzas {

    protected abstract Pizza criarPizza(String tipo);

    public Pizza pedirPizza(String tipo) {

        Pizza pizza = criarPizza(tipo);

        if (pizza == null) {
            System.out.println("Tipo de pizza não encontrado!");
            return null;
        }

        pizza.preparar();

        pizza.assar();

        pizza.cortar();

        pizza.embalar();

        return pizza;
    }
}