import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        Usuario usu = new Usuario();

        int valor;
        String nome;
        
        System.out.println("Informe sua idade: ");
        valor = sc.nextInt();
        usu.controleIdade(valor);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        usu.cadastrar(nome);
        


        

       
        



    }
}
