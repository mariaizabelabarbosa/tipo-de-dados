import java.util.Scanner;
public class Tarefa_04_Mariaizabela {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int idade1, idade2;
        String nome1, nome2;

        System.out.println("Informe o nome da primeira pessoa ");
        nome1 = input.next();

        System.out.println("Informe o nome da segunda pessoa ");
        nome2 = input.next();

        System.out.println("Informe a idade da primeira pessoa");
        idade1 = input.nextInt();

        System.out.println("Informe a idade da segunda pessoa");
        idade2 = input.nextInt();

        if ( idade1 > idade2)
        {
            System.out.print("" + nome1 + " é maior que " + nome2 + "\n");
        }
        else if ( idade2 > idade1)
        {
            System.out.print("" + nome2 + " é maior que " + nome1 + "\n");
        }
       
        }

}
    

