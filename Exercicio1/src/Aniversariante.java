package Exercicio1;


public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante (String nome, int dia, int mes) {
        this.nome=nome;
        this.dataAniversario = new DataAniversario ( dia, mes);
    }
    public Aniversariante (String nome, DataAniversario dataAniversario){
        this.nome=nome;
        this.dataAniversario =dataAniversario;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Aniversariante){
            Aniversariante outro = (Aniversariante) obj;
            boolean nomesIguais = this.nome.equals(outro.getNome());
            boolean datasIguais = this.dataAniversario.equals(outro.getDataAniversario());
            if (nomesIguais && datasIguais){
                return true;
            }

        }
        return false;
    }

    public String getNome(){
        return this.nome;
    }
    public  void setNome(String nome) {
        this.nome =nome;
    }
    public DataAniversario getDataAniversario(){
        return this.dataAniversario;
    }
    public void setDataAniversario (DataAniversario dataAniversario){
        this.dataAniversario = dataAniversario;
    }
    //gets e sets...

}
