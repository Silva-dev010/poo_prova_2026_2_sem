import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Insira seu nickname:");
        
        Heroina hornet = new Heroina("Hornet");

        System.out.println("=================================");
        System.out.println("     HOLLOW KNIGHT: SILKSONG");
        System.out.println("       edicao POO em Java");
        System.out.println("=================================");
        System.out.println("Carregando save de " + nome);

        System.out.println(hornet);
        hornet.curar();
        hornet.atacar(9);
        System.out.println(hornet);
        hornet.receberDano(4);
        System.out.println(hornet);
        hornet.curar();
        System.out.println(hornet);
        hornet.receberDano(10);
        System.out.println(hornet);
        System.out.println("Derrotada? " + hornet.estaDerrotada());
    }
}