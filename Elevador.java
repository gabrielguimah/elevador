public class Elevador {
    private int capacidade;
    private int qtd_passageiros;
    private int andar_atual;
    private int ultimo_andar;

    public Elevador (int capacidade, int qtd_passageiros, int andar_atual, int ultimo_andar){
        this.capacidade = capacidade;
        this.qtd_passageiros = qtd_passageiros;
        this.andar_atual = andar_atual;
        this.ultimo_andar = ultimo_andar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPassageiros() {
        return qtd_passageiros;
    }

    public void setQtdPassageiros(int qtd_passageiros) {
        this.qtd_passageiros = qtd_passageiros;
    }

    public int getAndarAtual() {
        return andar_atual;
    }

    public void setAndarAtual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getUltimoAndar() {
        return ultimo_andar;
    }

    public void setUltimoAndar(int ultimo_andar) {
        this.ultimo_andar = ultimo_andar;
    }

    private boolean podeSubir(int andar_atual){
        return andar_atual < ultimo_andar ? true : false;
    }

    public int subir(){
        if (podeSubir(andar_atual)){
            setAndarAtual(this.andar_atual += 1);
            return this.andar_atual;
        } else {
            return andar_atual;
        }
    }

    private boolean podeDescer (int andar_atual){
        return andar_atual >= 1 ? true : false;
    }

    public int descer(){
        if (podeDescer(this.andar_atual)) {
            setAndarAtual(this.andar_atual -= 1);
            return this.andar_atual;
        } else {
            return andar_atual;
        }
    }

    private boolean podeAdicionar(int passageiro){
        return passageiro <= capacidade ? true : false;
    }

    public int addpassageiro(){
        if (podeAdicionar(qtd_passageiros)){
            setQtdPassageiros(this.qtd_passageiros += 1);
            return this.qtd_passageiros;
        } else {
            return qtd_passageiros;
        }
    }

    private boolean podeRemover(int passageiro){
        return passageiro >= 1 ? true : false;
    }
    
    public int removerpassageiro(){
        if (podeRemover(qtd_passageiros)) {
            setQtdPassageiros(this.qtd_passageiros -= 1);
            return this.qtd_passageiros;
        } else {
            return qtd_passageiros;
        }
    }
}