package pizzaria;

public class FabricaIngredientesChicago
        implements FabricaIngredientesPizza {

    public Massa criarMassa() {
        return new MassaGrossa();
    }

    public Molho criarMolho() {
        return new MolhoTomate();
    }

    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    public Vegetais[] criarVegetais() {

        Vegetais vegetais[] = {
                new Espinafre(),
                new Berinjela(),
                new AzeitonasPretas()
        };

        return vegetais;
    }

    public Calabresa criarCalabresa() {
        return new CalabresaFatiada();
    }

    public Marisco criarMarisco() {
        return new MariscosCongelados();
    }
}