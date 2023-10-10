package Safari;

import java.util.ArrayList;
import java.util.List;

public class Safari implements Navegador{
    private String paginaInicial = "Homepage";
    private String paginaAtual;
    private List<String> abas;

    public Safari()
    {
        this.paginaAtual = this.paginaInicial;
        this.abas = new ArrayList<>();
        this.abas.add(this.paginaInicial);
    }

    @Override
    public void exibirPagina(String pagina) {
        this.paginaAtual = pagina;
        System.out.println("abrindo pagina "+ this.paginaAtual);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina atual : "+ this.paginaAtual);
    }

    @Override
    public void novaAba() {
        this.abas.add("Homepage");
    }

    public void trocarDeAba(String abaDestino)
    {
        if(abaDestino != this.paginaAtual)
        {
            if(!abas.contains(abaDestino))
            {
                System.out.println("Pagina "+ abaDestino+ " inexistente");
            }else
            {
                this.paginaAtual = abaDestino;
                System.out.println("aba atual : "+ this.paginaAtual);
            }
        }
    }
}
