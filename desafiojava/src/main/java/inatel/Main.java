package inatel;

public class Main {

    public static void main(String[] args) {
        // Criar uma instância de Filme
        Filme filme1 = new Filme("Zorra Total: A Morte do Seu Madruga!", 2000, "Comédia", 90);
        Filme filme2 = new Filme("A Queda de Tico Teco!", 2010, "Comédia e Drama", 100);
        Filme filme3 = new Filme("Morte do Rei Ganso Pelas Mãos de Tin Tin!", 2014, "Ação e Aventura", 115);

        // Chamar o método showDetails para exibir informações do filme
        System.out.println("Before the use of Setters: ");
        System.out.println();
        filme1.showDetails();
        System.out.println();
        filme2.showDetails();
        System.out.println();
        filme3.showDetails();

        filme1.setState(true);
        filme1.setRating(10);

        System.out.println();
        System.out.println("After the use of Setters: ");
        System.out.println();
        filme1.showDetails();
    }
}