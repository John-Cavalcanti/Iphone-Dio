import Ipod.Ipod;
import Safari.Safari;
import Telefone.Telefone;

public class Main {
    public static void main(String[] args) throws Exception {
        Telefone iphoneTelefone = new Telefone();
        Safari iphoneSafari = new Safari();
        Ipod iphoneIpod = new Ipod();

        System.out.println("Testes telefone :");
        iphoneTelefone.ligar("Joao");
        iphoneTelefone.atender("Sandro");
        iphoneTelefone.iniciarCorreioDeVoz();

        System.out.println("\nTestes Safari :");
        iphoneSafari.exibirPagina("Youtube");
        iphoneSafari.atualizarPagina();
        iphoneSafari.trocarDeAba("Instagram");
        iphoneSafari.novaAba();
        
        System.out.println("\nTestes Ipod :");
        iphoneIpod.tocarMusica("Vore");
        iphoneIpod.pausar();
        iphoneIpod.resumir();
    }
}
