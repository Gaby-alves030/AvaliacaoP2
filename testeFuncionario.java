public class testeFuncionario{
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Analista de Sistemas", 12000.00);

        System.out.println("Sua função é --> "+f.getCargo());
        System.out.println("Seu salario corresponde a --> "+f.getSalario());

    }

}