import java.util.Scanner;
public class Tarefa_05_Mariaizabela {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double salario1, SalarioNovo;
        
        System.out.println("Informe o valor do salario atual: ");
        salario1 = input.nextFloat();
    
        if (salario1 >= 1000 && salario1 <= 2000)
        {
            SalarioNovo = salario1 * 1.15;
            System.out.print("Aqui esta seu salario novo: " + SalarioNovo + "\n");
        }
    
        else if (salario1 >= 2000 && salario1 <= 3000)
        {
            SalarioNovo = salario1 * 1.10;
            System.out.print("Aqui esta seu salario novo: " + SalarioNovo + "\n");
        }
    
        else if(salario1> 3000)
        {
            SalarioNovo = salario1 * 1.5;
            System.out.print("Aqui esta seu salario novo: " +SalarioNovo + "\n");
        }
    
        else if(salario1 < 1000)
        {
            System.out.print("Você é estagiário, não reclame do salário. \n");
        }
    
    
        }
    
}
