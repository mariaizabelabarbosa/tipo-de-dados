import java.util.Scanner;
public class Tarefa_02_Mariaizabela {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Double peso1, altura2, imc3;

        System.out.println("Informe seu peso");
        peso1 = input.nextDouble();

        System.out.println("Informe sua altura");
        altura2 = input.nextDouble();

        imc3 = peso1 / (altura2 * altura2 );

        if ( imc3 <= 18.5)
        {
            System.out.print(" Você está abaixo do peso " + "\n");
        }
        else if ( imc3 >= 18.5 && imc3 <= 24.9)
        {
            System.out.print("Peso Normal" + "\n");
        }
        else if ( imc3 >= 25.0 && imc3 <= 29.9)
        {
            System.out.print("Sobrepeso" + "\n");
        }
        else if ( imc3 >= 30.0 && imc3 <= 34.9)
        {
            System.out.print("Você está em obesidade grau 1 !!!" + "\n");
        }
        else if ( imc3 >= 35.0 && imc3 <= 39.9)
        {
            System.out.print("Você está em obesidade grau 2 !!!" + "\n");  
        }
        else if ( imc3 > 40.0)
        {
            System.out.print("Você está em obesidade grau 3!!!" + "\n"); 
        }




   }
}



    

