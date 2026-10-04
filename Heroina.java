import lombok.Getter;

@Getter
public class Heroina {
    public static final int MASCARAS_MINIMO = 0;
    public static final int MASCARAS_MAXIMO = 5;
    public static final int SEDA_MINIMO = 0;
    public static final int SEDA_MAXIMO = 9;

    private String nome;
    private int mascaras = MASCARAS_MAXIMO;
    private int seda = SEDA_MINIMO;

    public Heroina(String nome){
        this.nome = nome;
    }
    public String toString(){
        return nome + " | Mascaras: " + mascaras + "/5 | Sedas: " + seda + "/9";
    }
    public void atacar(){
        System.out.println(nome + " ataca com a agulha!");
        if(seda<SEDA_MAXIMO){
            seda++;
        }
    }
    public void atacar(int vezes){
        for(int i=0; i<vezes; i++){
            atacar();
        }
    }
    public void receberDano(int dano){
        System.out.println(nome + " recebeu " + dano + " de dano.");
        mascaras = Math.max(MASCARAS_MINIMO, mascaras - dano);
    }
    public void curar(){
        if(seda==SEDA_MAXIMO){
            mascaras = Math.min(mascaras+3, MASCARAS_MAXIMO);
            seda=SEDA_MINIMO;
            System.out.println(nome + " se amarrou com seda e recuperou mascaras.");
        }
        else{
            System.out.println(nome + " nao tem seda suficiente para se curar.");
        }
    }
    public boolean estaDerrotada(){
        if(mascaras==MASCARAS_MINIMO){
            return true;
        }
        else {
            return false;
        }
    }
}