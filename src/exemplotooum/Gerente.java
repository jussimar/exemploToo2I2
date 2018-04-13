
package exemplotooum;

public class Gerente extends Funcionario{
    private String senhaGerente;

    public Gerente(int codFuncionario) {
        super(codFuncionario);
    }

    public boolean logar(String senha){
        boolean result;
        if(senha == this.senhaGerente){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    //sobrescrita de metodo
    @Override
    public void mostrarNome(){
        System.out.println("Nome do Gerente: " + this.getNome());
    }
    //get e set dos atributo sobrenome
    
    public void setSenhaGerente(String senha){
        this.senhaGerente = senha;
    }
    
    
   
}
