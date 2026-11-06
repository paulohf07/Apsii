package pizzaria;

public abstract class Pizza {

    String nome;

    Massa massa;
    Molho molho;
    Vegetais vegetais[];
    Queijo queijo;
    Calabresa calabresa;
    Marisco marisco;

    abstract void preparar();

    void assar() {
        System.out.println("Assar por 25 minutos a 350 graus");
    }

    void cortar() {
        System.out.println("Cortar a pizza em fatias diagonais");
    }

    void embalar() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria");
    }

    void definirNome(String nome) {
        this.nome = nome;
    }

    String obterNome() {
        return nome;
    }

    public String toString() {

        StringBuilder resultado = new StringBuilder();

        resultado.append("---- ").append(nome).append(" ----\n");

        resultado.append(massa).append("\n");
        resultado.append(molho).append("\n");

        if (queijo != null) {
            resultado.append(queijo).append("\n");
        }

        if (vegetais != null) {
            for (Vegetais vegetal : vegetais) {
                resultado.append(vegetal).append("\n");
            }
        }

        if (calabresa != null) {
            resultado.append(calabresa).append("\n");
        }

        if (marisco != null) {
            resultado.append(marisco).append("\n");
        }

        return resultado.toString();
    }
}
