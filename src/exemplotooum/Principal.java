package exemplotooum;

public class Principal {

    public static void main(String[] args) {
        //Instanciando classe pessoa - criando objeto
        /*
        Pessoa p = new Pessoa();
        //Passando valor pora os atributos 
        p.nome = "Dougras";
        p.sobrenome = "Camilo";
        p.idade = 18;
        
        //System.out.println("Nome: " + p.nome);
        p.mostrarNome();
        System.out.println("Ano nascimento: " + p.anoNascimento(2018));
        */
        System.out.println("##########  Funcionario ############");
        Funcionario f = new Funcionario(200);
        f.setCodFuncionario(123);
        f.setNome("Mario");
        f.setSobrenome("Oliveira");
        f.setIdade(20);
        f.mostrarNome();
        f.mostrarIdade();
        System.out.println("Ano nascimento " + f.anoNascimento(2018));
        f.mostrarCod();
        
        System.out.println("##########  Gerente ############");
        Gerente g = new Gerente(4000);
        g.setNome("Julio");
        //g.setCodFuncionario(456);
        g.setIdade(50);
        g.setSenhaGerente("1234");
        
        g.mostrarNome();
        g.mostrarIdade();
        System.out.println("Ano Nascimento Gerente: " + g.anoNascimento(2018));
        g.mostrarCod();
        
        if(g.logar("1234")){
            System.out.println("Conectado! :)");
        }else{
            System.out.println("Não Conectado :(");
        }
        //System.out.println("##########  Cliente ############");
        Cliente c = new Cliente(200);
        c.setNome("Ana");
        c.setSobrenome("Nascimento");
        c.setIdade(30);
        //c.setCodCliente(741);
        c.setCredito(3000);
        
        //c.mostrarNome();
        //c.mostrarIdade();
        //System.out.println("Ano Nascimento Cliente: " + c.anoNascimento(2018));
        
        MostrarDados.mostrarDadosCliente(c);
        
        if(c.comprar(3100)){
            System.out.println("Compra Aprovada! :)");
        }else{
            System.out.println("Compra não autorizada :(");
        }
   
    }
    
}
