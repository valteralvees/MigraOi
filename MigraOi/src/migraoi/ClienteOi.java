
package migraoi;

import java.util.Random;

public class ClienteOi {
    String nome;
    int ddd;
    long numeroTelefone;
    static boolean situacaoAtivo = true;
    double saldoRecarga = 20.55;
    int rg;
    static boolean migracaoConcluida = false;
    //Método
    long trocarParaVivo (long numeroTelefone){
        Random novoNum = new Random();
        long numVivo = novoNum.nextLong(99999999);
        numeroTelefone = numVivo;
        for (int i =0; i<10;i++){
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
        }
        
        System.out.println("Migração feita com sucesso! Você agora é um cliente Vivo Móvel PE. Que bom ter você com a gente!");
        System.out.println("Bem vindo a Vivo. Seu novo número é (81) 9 "+ numeroTelefone);
        return numVivo;
    }
    
    //Construtor
    ClienteOi (String passaNome, int passaDdd, long passaNumero,int passaRg){
        nome = passaNome;
        ddd = passaDdd;
        numeroTelefone = passaNumero;
        rg = passaRg;
    }
}
