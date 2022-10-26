import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int Idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) { 
                break; 
            }

            System.out.println("Idade: ");
            Idade = scan.nextInt();

        }
    }
}
