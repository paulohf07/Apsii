public class Diretor extends Gerente {
    private double participacaoLucro;

    public Diretor(String nome, String matricula,double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus,
                   double participacaoLucro){
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus);
        this.participacaoLucro = participacaoLucro;
    }
    public double getParticipacaoLucro(){
        return participacaoLucro;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoLucro;
    }
}
