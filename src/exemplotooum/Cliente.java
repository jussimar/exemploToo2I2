
package exemplotooum;


public class Cliente extends Pessoa{
    private int codCliente;
    private double credito;
    
    public Cliente(int cod){
        this.codCliente = cod;
    }
    
    public Cliente(){
        
    }
    
    public boolean comprar(double valorCompra, double valorDinheiro){
        boolean result;
        if((valorDinheiro + this.credito)>=valorCompra){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    //sobrecarga do método comprar
    public boolean comprar (double valorCompra){
        boolean result;
        if(this.credito >= valorCompra){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    @Override
    public void mostrarIdade() {
        System.out.println("Idade do Cliente: " + this.getIdade());
    }
    
    //get e set
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
}
