package Herança;

public class AtividadeHeranca {

    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("21584595247", "Fernando Dos Santos",28,"Luana Peixote","1235468521396/0");

        pessoaJuridica.Visu();


        package Herança;

        public class Cliente {

            private String cpf;

            public Cliente(String cpf) {
                this.cpf = cpf;

            }



            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
            public void Visu(){
                System.out.println("\n\n************************************************************");
                System.out.println("                   Dados do Cliente:                            ");
                System.out.println("****************************************************************");
                System.out.println("CPF da Pessoa fisica: " + this.cpf);

                public class PessoaFisica extends Herança.Cliente {

                    private String nome;
                    private int   idade;

                    public PessoaFisica(String cpf, String nome, int idade){
                        super(cpf);
                        this.nome = nome;
                        this.idade = idade;
                    }

                    public String getNome() {
                        return nome;
                    }

                    public void setNome(String nome) {
                        this.nome = nome;
                    }

                    public int getIdade() {
                        return idade;
                    }

                    public void setIdade(int idade) {
                        this.idade = idade;
                    }
                    @Override
                    public void Visu() {

                        super.Visu();
                        System.out.println("Nome da pessoa fisica: " + this.nome);
                        System.out.println("Idade da pessoa fisica: " + this.idade);

                        public class PessoaJuridica extends Herança.PessoaFisica {

                            private String nome1, cnpj;

                            public String getNome1() {
                                return nome1;
                            }

                            public void setNome1(String nome1) {
                                this.nome1 = nome1;
                            }

                            public String getCnpj() {
                                return cnpj;
                            }

                            public void setCnpj(String cnpj) {
                                this.cnpj = cnpj;
                            }

                            public PessoaJuridica(String cpf, String nome, int idade, String nome1, String cnpj){
                                super(cpf,nome,idade);
                                this.nome1 = nome1;
                                this.cnpj = cnpj;



                            }
                            @Override
                            public void Visu(){
                                super.Visu();
                                System.out.println("Nome da pessoa juridica: " + this.nome1);
                                System.out.println("CNPJ da pessoa juridica: " + this.cnpj);

                    }
        }
    }
}
