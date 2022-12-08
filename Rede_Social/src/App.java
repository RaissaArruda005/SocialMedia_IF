import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        Usuario usu = new Usuario();

        int valor;
        String nome;
        String genero;
        String email;
        int escolha_L_ou_C = 0; 

        
        while (escolha_L_ou_C  != 3){
        System.out.print("\n Digite: \n 1 - Cadastrar \n 2- Logar \n 3 - Sair \n:");
        escolha_L_ou_C = sc.nextInt();

        if (escolha_L_ou_C == 1){

            sc.nextLine();
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();
        
            System.out.print("Informe seu e-mail: ");
            email = sc.nextLine();
            System.out.print("Informe seu gênero: ");
            genero = sc.nextLine();


            
            usu.cadastrar(nome, email, genero);
            

            System.out.print("Informe sua idade: ");
            valor = sc.nextInt();
            usu.controleIdade(valor);




                }
        
            }
            
        
        
        



        

        


        

       
        



    }
}
