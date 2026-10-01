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
    }
}