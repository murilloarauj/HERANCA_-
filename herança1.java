package heranca;

//Classe Individuo que tem atributos comuns 
class Individuo {
 // Atributos gerais para todas as pessoas
 private String nomeint;
 private String endereço;
 private String Email;

 // Construtor para inicializar os atributos comuns
 public Individuo(String nomeint, String endereço, String Email) {
     this.nomeint = nomeint;
     this.endereço = endereço;
     this.Email = Email;
 }

 // Método para obter o valor de 'nome'
 public String getNomeint() {
     return nomeint;
 }

 // Método para alterar o valor de 'nome'
 public void setNomeint(String nomeint) {
     this.nomeint = nomeint;
 }

 // Método para obter o valor de 'endereço'
 public String getEndereço() {
     return endereço;
 }

 // Método para alterar o valor de 'endereço'
 public void setEndereço(String endereço) {
     this.endereço = endereço;
 }

 // Método para obter o valor de 'Email'
 public String getEmail() {
     return Email;
 }

 // Método para alterar o valor de 'Email'
 public void setEmail(String Email) {
     this.Email = Email;
 }

 // Método que retorna os dados
 public String exibir() {
     return "Nome Completo: " + nomeint + "\nEndereço da Casa: " + endereço + "\nEmail: " + Email;
 }
}

//Classe PessoaJuridica que recebe as caracteristicas em comum de Individuo e adiciona o atributo CNPJ
class PessoaJuridica extends Individuo {
 // Atributo EXCLUSIVO de Pessoa Jurídica
 private String cnpj;

 // Construtor que inicializa os atributos 
 public PessoaJuridica(String nomeint, String endereço, String Email, String cnpj) {
     super(nomeint, endereço, Email); // Chama as informações do construtor em comum
     this.cnpj = cnpj;
 }

 // Método para obter o valor de 'cnpj'
 public String getCnpj() {
     return cnpj;
 }

 // Método para alterar o valor de 'cnpj'
 public void setCnpj(String cnpj) {
     this.cnpj = cnpj;
 }

 // Método que retorna as informações da pessoa jurídica
 public String exibir() {
     return super.exibir() + "\nNúmero do CNPJ: " + cnpj;
 }
}

//Classe PessoaFisica que recebe as caracteristicas em comum de Individuo e adiciona o atributo CPF
class PessoaFisica extends Individuo {
 // Atributo EXCLUSIVO de Pessoa Física
 private String cpf;

 // Construtor que inicializa os atributos
 public PessoaFisica(String nomeint, String endereço, String Email, String cpf) {
     super(nomeint, endereço, Email); // Chama as informações do construtor em comum
     this.cpf = cpf;
 }

 // Método para obter o valor de 'cpf'
 public String getCpf() {
     return cpf;
 }

 // Método para alterar o valor de 'cpf'
 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

 // Método que retorna as informações da pessoa física
 public String exibir() {
     return super.exibir() + "\nNúmero do CPF: " + cpf;
 }
}

//Classe Vendedor que recebe as caracteristicas em comum de Individuo e adiciona CPF e Salário
class Vendedor extends Individuo {
 // Atributos EXCLUSIVOS para Vendedor
 private String cpfVendedor;
 private float valorSalario;

 // Construtor que inicializa os atributos 
 public Vendedor(String nomeint, String endereço, String Email, String cpfVendedor, float valorSalario) {
     super(nomeint, endereço, Email); // Chama o construtor da superclasse
     this.cpfVendedor = cpfVendedor;
     this.valorSalario = valorSalario;
 }

 // Método para obter o valor de 'cpfVendedor'
 public String getCpfVendedor() {
     return cpfVendedor;
 }

 // Método para alterar o valor de 'cpfVendedor'
 public void setCpfVendedor(String cpfVendedor) {
     this.cpfVendedor = cpfVendedor;
 }

 // Método para obter o valor de 'valorSalario'
 public float getValorSalario() {
     return valorSalario;
 }

 // Método para alterar o valor de 'valorSalario'
 public void setValorSalario(float valorSalario) {
     this.valorSalario = valorSalario;
 }

 // Método que retorna as informações do vendedor
 public String exibir() {
     return super.exibir() + "\nNúmero do CPF: " + cpfVendedor + "\nSalário do vendedor: " + valorSalario;
 }
}

//Classe principal para testar as classes criadas
public class herança1 {
 public static void main(String[] args) {
     // Colocando valores aos objetos de PessoaJuridica, PessoaFisica e Vendedor
     PessoaJuridica empresa1 = new PessoaJuridica("Tech Solutions", "Av. Paulista, 500, São Paulo", "contato@techsolutions.com.br", "12.345.678/0001-22");
     PessoaFisica pessoa1 = new PessoaFisica("Ana Silva", "Rua do Sol, 123, Campinas", "ana.silva@mail.com", "111.222.333-44");
     Vendedor vendedor1 = new Vendedor("Lucas Souza", "Rua das Palmeiras, 400, Curitiba", "lucas.souza@mail.com", "555.666.777-88", 4500.00f);

     // Exibindo as informações 
     System.out.println(empresa1.exibir());
     System.out.println("---------------");
     System.out.println(pessoa1.exibir());
     System.out.println("---------------");
     System.out.println(vendedor1.exibir());
 }
}