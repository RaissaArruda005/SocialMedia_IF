import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Usuario usu = new Usuario();

        int valor;
        
        System.out.println("Informe sua idade: ");
        valor = sc.nextInt();
        usu.controleIdade(valor);

        usu.cadastrar();

       
        



    }
}
