package exemplotooum;

public abstract class Pessoa {
    //Criando atributos da classe
    private String nome;
    private String sobrenome;
    private int idade;
    
    //Criando os métodos da classe
    public void mostrarNome () {
        System.out.println("Nome: " + this.nome);
    }
    
    public abstract void mostrarIdade();
    
    public int anoNascimento (int anoAtual) {
        return anoAtual - this.idade;
    }
    //get e set dos atributo nome
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome != ""){
            this.nome = nome;
        }
    }
    //get e set dos atributo sobrenome
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    //get e set dos atributo idade
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}
