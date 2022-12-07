public class Usuario extends Pessoa {
    
    public void Mm_idade( ){
        if (getIdade() < 18){

            System.out.println("Menor de idade! Não pode usar a rede social");


            
        }
        else 
        {

            System.out.println("Maior de idade! pode usar a Rede social");

        }

    }

}
