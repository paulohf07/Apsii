public class Principal {
    public static void main(String [] args){
        Funcionario f1 = new Funcionario("Paulo Henrique", "F001", 2500.00,
                "01/06/2026");
        FuncionarioCLT fCLT= new FuncionarioCLT("Adriane Cristina", "F002", 3000.00,
                "01/03/2020", 220.0, 400.0);
        Gerente gerente = new Gerente("Maite Queiroz", "F000", 8000.00,
                "03/09/2019", 300.00, 250.00, 12, 0.20);
        Estagiario estagiario = new Estagiario("Analu Queiroz", "F004", 0.0,
                "01/09/2025", 1500.00, 20 );
        Diretor diretor = new Diretor("Hella face","D001", 20.000, "01/01/2025", 400.00,
                600.00, 15, 0.30, 5000.00);

        System.out.println(f1);
        System.out.println(fCLT);
        System.out.println(gerente);
        System.out.println(estagiario);
        System.out.println(diretor);


    }


}
