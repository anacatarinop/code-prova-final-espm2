
// 1 - 
class Cliente {
    private String nome;
    private String cpf;
    private int tempo;

    public Cliente(String nome, String cpf, int tempo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTempo() {
        return tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
// 2 - 
class Loja {
    private Cliente[] clientes = new Cliente[5];
    private String nomeLoja;
    public Loja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void armazenar(Cliente cliente) {

        // Verifica se o array está cheio
        if (this.clientes[this.clientes.length - 1] != null) {
            System.out.println("Array cheio!");
            System.out.println("Cliente NÃO inserido na Loja: " + cliente.getNome());
            return;
        }else{
            // Armazena o cliente no array
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] == null) {
                    this.clientes[i] = cliente;
                    System.out.println("Novo cliente inserido na Loja: " + cliente.getNome());
                    break;
                }
            }
        }
    }
// 3 -
    public void imprimir() {
        System.out.println("\nQuestão 3 - Listagem dos clientes e valores");
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.println("Nome: " + clientes[i].getNome());
                System.out.println("Valor: " + (clientes[i].getTempo() * 0.5));
                System.out.println("---------------------------------------");
            }
        }
        
    }
// 4 -
    public void maisUtilizou() {
        int maior = 0;
        int indice = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getTempo() > maior) {
                    maior = clientes[i].getTempo();
                    indice = i;
                }
            }
        }
        System.out.println("\nQuestão 4 - Cliente que mais tempo ficou com um carro alugado\nNome: " + clientes[indice].getNome());
    }
// 5 -
    public void valorTotal() {
        double total = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                total += clientes[i].getTempo() * 0.5;
            }
        }
        System.out.println("\nQuestão 5 - Valor total que a loja recebeu com os aluguéis: " + total);
    }
}
public class Teste{
    public static void main(String[] args){
        // Testes
        Loja loja1 = new Loja("Loja A");


        // Clientes
        System.out.println("\nQuestão 1 - Criando clientes usando o TAD");
        Cliente c1 = new Cliente("Pedro", "1111", 10);
        Cliente c2 = new Cliente("João", "2222", 20);
        Cliente c3 = new Cliente("Maria", "3333", 30);
        Cliente c4 = new Cliente("Rosa", "4444", 40);
        Cliente c5 = new Cliente("Lucas", "5555", 50);
        Cliente c6 = new Cliente("Eduardo", "6666", 100);

        // Teste questão 2 - Inserindos os clientes na loja
        System.out.println("\nQuestão 2 - Inserindo no máximo 5 clientes");
        loja1.armazenar(c1);
        loja1.armazenar(c2);
        loja1.armazenar(c3);
        loja1.armazenar(c4);
        loja1.armazenar(c5);
        loja1.armazenar(c6);

        // Teste questao 3
        loja1.imprimir();

        // Teste questão 4
        loja1.maisUtilizou();

        // Teste questao 5
        loja1.valorTotal();

        
    }
}