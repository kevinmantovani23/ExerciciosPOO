package entity;

public class Aluno {

    private String nome;
    private int ra;
    private String nascimento;
    private double media;

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public int getRa() {
        return ra;
    }
    public String getNascimento() {
        return nascimento;
    }
    public double getMedia() {
        return media;
    }

    
}