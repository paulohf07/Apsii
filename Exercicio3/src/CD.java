public class CD extends Produto implements InfoGerais {
    private int numFaixas;
    public int getnumFaixas() {
        return numFaixas;
    }
    public void setNumFaixas(int numFaxias){
        this.numFaixas = numFaixas;
    }
    @Override
    public void exibeInformacoes(){
        System.out.println("Nome:"+getNome());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Numero de faixas:" + numFaixas);
    }
}
