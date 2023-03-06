import java.util.Scanner;
public class Tarefa_01_MariaIzabela {

 public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        double NovoSalario, AumentoSalario;

        System.out.println("Informe seu salario: ");
        NovoSalario = input.nextFloat();

        if (NovoSalario >= 1000 && NovoSalario <= 2000) 
        { AumentoSalario = NovoSalario * 1.15;
        System.out.print("Aqui esta seu salario novo: " + AumentoSalario + "\n"); }

        else if ( NovoSalario >= 2000 && NovoSalario <= 3000) { AumentoSalario = NovoSalario * 1.10;
        System.out.print("Aqui esta seu salario novo: " + AumentoSalario + "\n"); }
        else if(NovoSalario > 3000) {
        AumentoSalario = NovoSalario * 1.5;
        System.out.print("Aqui esta seu salario novo: " + AumentoSalario + "\n"); 

       
    }
    }
    }
    