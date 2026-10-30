package Exercicio1;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args){
        MinhaAgendaDeAniversarios agenda= new MinhaAgendaDeAniversarios();


        agenda.adicionarAniversariante("Paulo", 21, 8);
        agenda.adicionarAniversariante("luana", 18,1);
        agenda.adicionarAniversariante("Adriane",16,3);

        ArrayList<String> hoje= agenda.obterAniversariantesDoDia(21,8);
        System.out.println("Aniversariantes de 21/08:" + hoje);

    }
}