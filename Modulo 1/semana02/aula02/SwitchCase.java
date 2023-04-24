public class SwitchCase {
    public static void main(String[] args) {
        String cor = "Amarelo";

        switch (cor) {
            case "Azul":
                System.out.println("Cor do céu");
                break;
            case "Verde":
                System.out.println("Cor da grama");
                break;
            case "Dourado":
                System.out.println("Cor do ouro");
                break;
            default:
                System.out.println("Outra cor");
                break;
        }
    }
}
