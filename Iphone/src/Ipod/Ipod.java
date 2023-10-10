package Ipod;

public class Ipod implements ReprodutorMusical{
    private String musicaAtual;
    private boolean tocandoMusica;

    public Ipod()
    {
        musicaAtual = "";
        tocandoMusica = false;
    }

    @Override
    public void tocarMusica(String musica) {
        this.musicaAtual = musica;
        this.tocandoMusica = true;
        System.out.println("Tocando musica : "+ this.musicaAtual);
    }

    @Override
    public void pausar() {
        if(this.tocandoMusica)
        {
            System.out.println("Musica atual :"+ this.musicaAtual+" pausada");
            this.tocandoMusica = false;
        }
    }

    @Override
    public void resumir() {
        if(!this.tocandoMusica && !this.musicaAtual.equals(""))
        {
            this.tocandoMusica = true;
            System.out.println("Resumindo : "+this.musicaAtual);
        }
    }
    
}
