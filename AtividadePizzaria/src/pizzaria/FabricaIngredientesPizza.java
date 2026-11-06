package pizzaria;

public interface FabricaIngredientesPizza {

    public Massa criarMassa();

    public Molho criarMolho();

    public Queijo criarQueijo();

    public Vegetais[] criarVegetais();

    public Calabresa criarCalabresa();

    public Marisco criarMarisco();
}