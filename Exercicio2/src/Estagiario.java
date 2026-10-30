public class Estagiario extends Funcionario {
    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario (String nome, String matricula, double salarioBase, String dataAdmissao,
                       double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, 0.0, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public double calcularDesconto() {
        return 0.0;
    }
}

