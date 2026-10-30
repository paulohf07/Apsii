public class Veiculo {
    protected String modelo;
    protected int ano;
    public Veiculo(String novoModelo, int novoAno){
        this.modelo = novoModelo;
        this.ano = novoAno;
    }
    public String imprimeDetalhes(){
        return "\n Modelo:" + this.modelo +"\nAno:" +this.ano;

    }
}
