package Telefone;

import java.util.Arrays;
import java.util.List;

public class Telefone implements Phone {
    List<String> correioDeVoz;

    public Telefone()
    {
        correioDeVoz = Arrays.asList("alo", "ola","esta livre na sexta?", "como foi seu dia ?", "terminou as tasks ?");
    }

    @Override
    public void ligar(String contato)
    {
        System.out.println("Ligando para :"+ contato);
    }

    @Override
    public void atender(String contato)
    {
        System.out.println("Atendendo "+ contato);
    }

    @Override
    public void iniciarCorreioDeVoz()
    {
        System.out.println("tocando correio de voz");
    }
}
