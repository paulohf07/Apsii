package Exercicio1;
import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios{
    private final ArrayList<Aniversariante> lista;
    public MinhaAgendaDeAniversarios(){
        this.lista=new ArrayList<>();
    }
    @Override
    public void adicionarAniversariante (String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        this.lista.add(novo);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<>();

        for(int i =0; i<this.lista.size();i++){
            Aniversariante a = this.lista.get(i);

            if (a.getDataAniversario().getDia() == dia && a.getDataAniversario().getMes()==mes){
                nomesDoDia.add(a.getNome());
            }
        }
        return nomesDoDia;
    }

    @Override
    public void removerAniversariante(String NomeAniversariante) {
        for(int i = this.lista.size() -1; i>=0;i--){
            Aniversariante a = this.lista.get(i);
            if (a.getNome().equalsIgnoreCase(NomeAniversariante)){
                this.lista.remove(i);
            }
        }
    }
}
