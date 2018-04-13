
package exemplotooum;

public class Funcionario extends Pessoa{
    private int codFuncionario;
    
    public Funcionario(int codFuncionario){
        this.codFuncionario = codFuncionario;
    }
    
    public void mostrarCod(){
        System.out.println("Cod.:" + this.codFuncionario);
    }
    //sobrescrita de metodo
    @Override
    public void mostrarNome(){
        System.out.println("Nome do Funcionario: " + this.getNome());
    }

    @Override
    public void mostrarIdade() {
        System.out.println("Idade do funcionario: " + this.getIdade());
    }
    
    //get e set

    public int getCodFuncionario() {
        return this.codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
}
