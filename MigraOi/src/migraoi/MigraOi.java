package migraoi;
import java.util.Scanner;

public class MigraOi {

    public static void main(String[] args) {
        int menu = 0;
        System.out.println("Operador, digite as seguintes informações do cliente(em ordem e separadas por vírgula)- Nome, DDD, Número Oi, RG");
        ClienteOi cli1 = new ClienteOi("Hugo Silveira", 81,988395907,9800130);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao processo eletrônico de migração de operadora - OI");
        
        //Atribuição por referência
        ClienteOi cli2 = new ClienteOi(cli1.nome,cli1.ddd,cli1.numeroTelefone,cli1.rg);
        System.out.println(cli2.nome);
        
        
        if (cli1.ddd != 0 && cli1.numeroTelefone != 0){
            System.out.println("Oi, "+cli1.nome+"! Localizamos o seu cadastro aqui. O que você deseja?");
            System.out.println("1- EFETUAR MIGRAÇÃO ");
            System.out.println("2- CONSULTAR STATUS DO NÚMERO");
            System.out.println("3- VERIFICAR SALDO DE RECARGA");
            System.out.println("4- REALIZAR RECARGA");
            menu = teclado.nextInt();
            switch (menu){
                case 1 -> {
                    System.out.println("1- MIGRAÇÃO DE NÚMERO");
                    System.out.println("Você está prestes a mudar de número. Será gerado um novo número na operadora VIVO, escolhida pela ANATEL para seguir com a operação da Oi na sua região.");
                    //MÉTODO 1
                    cli1.trocarParaVivo(cli1.numeroTelefone);
                    
                    ClienteOi.migracaoConcluida = true;
                    
                 }
                case 2 -> {
                    System.out.println("2- CONSULTA DE STATUS");
                    if(ClienteOi.situacaoAtivo == true){
                        System.out.println("O seu número está ativo na Oi e disponível para recebr recargas.");
                    }else{
                        System.out.println("Seu número não está mais ativo na Oi. Caso não tenha solicitado a desativação, consulte o atendimento Oi.");
                    }
                 }
                case 3 -> {
                    System.out.println("3- VERIFICAR SALDO");
                    System.out.println("O seu saldo atual é de R$"+ cli1.saldoRecarga+" e está disponível para utilização até que você decida migrar para a VIVO.");
                 }
                case 4 -> {
                    System.out.println("4- EFETUAR RECARGA");
                    int valorRecarga, verificaRG;
                    System.out.println("Saldo atual: R$"+cli1.saldoRecarga);
                    System.out.println("Por favor, digite o valor que você deseja adicionar: R$");
                    valorRecarga = teclado.nextInt();
                    System.out.println("Por favor, digite o número do sue RG para confirmar sua recarag de R$"+valorRecarga+"em seu número com o cartão cadastrado:");
                    verificaRG = teclado.nextInt();
                    if(verificaRG == cli1.rg){
                        cli1.saldoRecarga = cli1.saldoRecarga + valorRecarga;
                        System.out.println("Sua recarga foi efetuada com sucesso!");
                        System.out.println("Seu novo saldo é de R$"+ cli1.saldoRecarga);
                    } else {
                        //Atributo de classe
                        ClienteOi.situacaoAtivo = false;
                        System.out.println("Informações incorretas. Para sua segurança seu número encontra-se INATIVO e deve ser reativado em uma loja Oi.");
                    }
                 }
            }
            
            
        } else {
            System.out.println("Não localizamos o seu cadastro na base de dados da Oi. Verifique seus dados e tente novamente mais tarde.");
        }
        
        
        /*if (migrado == true){
            System.out.println("Vimos que o seu processo de migração /*para a [operadora] foi iniciado. O que deseja fazer?");
            System.out.println("==========================================");
            System.out.println("1- VERIFICAR SITUAÇÃO DE MIGRAÇÃO");
            System.out.println("2- CANCELAR PROCESSO DE MIGRAÇÃO");
            System.out.println("==========================================");
        } else {
            
        }
        System.out.println("O que você deseja?");
        System.out.println("==========================================");
        System.out.println("1- VERIFICAR SITUAÇÃO DE MIGRAÇÃO");
        System.out.println("2- INICIAR PROCESSO DE MIGRAÇÃO");
        System.out.println("==========================================");
        menu1 = teclado.nextInt();
        switch (menu1) {
            case 1:
                System.out.println("");
        }*/
    }
    
}
