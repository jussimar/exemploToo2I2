
package exemplotooum;


public class MostrarDados {
    public static void mostrarDadosCliente(Cliente c){
        System.out.println("####### Dados do Cliente - classe mostrar dados####");
        System.out.println("Nome do Cliente: " + c.getNome() + " " + c.getSobrenome());
        System.out.println("Idade: " + c.getIdade());
        System.out.println("Cod.:" + c.getCodCliente());
        System.out.println("Crédito: " + c.getCredito());
        
    }
}
