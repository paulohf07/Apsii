package pizzaria;

public class Principal {

    public static void main(String[] args) {

        // Criando a pizzaria de Nova York
        LojaPizzas pizzariaNY = new PizzariaNovaYork();

        System.out.println("===== PIZZARIA DE NOVA YORK =====");

        Pizza pizza1 = pizzariaNY.pedirPizza("queijo");

        System.out.println(pizza1);


        // Criando a pizzaria de Chicago
        LojaPizzas pizzariaChicago = new PizzariaChicago();

        System.out.println("===== PIZZARIA DE CHICAGO =====");

        Pizza pizza2 = pizzariaChicago.pedirPizza("mariscos");

        System.out.println(pizza2);

    }
}