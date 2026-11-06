package pizzaria;

public class FabricaIngredientesNovaYork implements FabricaIngredientesPizza {

    public Massa criarMassa() {
        return new MassaFina();
    }

    public Molho criarMolho() {
        return new MolhoMarinara();
    }

    public Queijo criarQueijo() {
        return new QueijoReggiano();
    }

    public Vegetais[] criarVegetais() {

        Vegetais vegetais[] = {
                new Alho(),
                new Cebola(),
                new Cogumelo(),
                new PimentaoVermelho()
        };

        return vegetais;
    }

    public Calabresa criarCalabresa() {
        return new CalabresaFatiada();
    }

    public Marisco criarMarisco() {
        return new MariscosFrescos();
    }
}