public abstract class Pessoa {

   private String nome;
   private int idade;
   private String email;
   private String Biografia;
   private String genero;


   public abstract void Mm_idade();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiografia() {
        return this.Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}