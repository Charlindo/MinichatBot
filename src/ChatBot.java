import java.util.Scanner;

public class ChatBot {

    public void saudacao(){
        System.out.println("Olá! Como posso te ajudar?");
    }

    public void nome(){
        System.out.println("Eu sou o MiniChatbot!");
    }

    public void comoEsta(){
        System.out.println("Estou funcionando perfeitamente, obrigado!");
    }

    public void repostaPadrao(){
        System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
    }

    public void processarEntrada(String entrada) {

        String mensagem = entrada.toLowerCase();

        if (mensagem.contains("olá") || mensagem.contains("oi")) {
            saudacao();
        } else if (mensagem.contains("qual é seu nome")) {
            nome();
        } else if (mensagem.contains("como você está")) {
            comoEsta();
        } else if (mensagem.contains("clima")) {
            System.out.println("O clima está ótimo hoje!");
        } else if (mensagem.contains("esporte")) {
            System.out.println("Eu gosto de futebol!");
        } else if (mensagem.contains("programação")) {
            System.out.println("Programação é muito interessante!");
        }else if (mensagem.contains("sair")){
            System.out.println("Até logo! Foi bom conversar com você.");
            System.exit(0);
        }else {
            repostaPadrao();
        }
    }


        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            ChatBot chatBot = new ChatBot();

            System.out.println("Bem-vindo ao MiniChatBot! Como posso te ajudar?");

            while (true){
                String entrada = sc .nextLine();
                chatBot.processarEntrada(entrada);
            }
        }

    }

