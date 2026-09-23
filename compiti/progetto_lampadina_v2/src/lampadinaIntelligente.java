public class lampadinaIntelligente {
    private int potenza;
    private int intensita;
    private String colore;
    private String nome;
    private boolean accesa;

    public lampadinaIntelligente(int potenza) {
        this.potenza = potenza;
        this.nome = "";
        this.intensita = 50;
        this.colore = "bianco";
        this.accesa = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColore() {
        return colore;
    }
    public String setColore(String colore) {
        this.colore = colore;
    }

    public void accendi() {
        this.accesa = true;
    }
    public void spegni() {
        this.accesa = false;
    }
}
