public class Pratica03 {
    public static void main(String[] args) {
        String cor = "";
        String resultado = null;
        switch (cor) {
            case "vermelho":
                resultado = "Deve parar o carro";
                break;
            case "amarelo":
                resultado = "Deve ficar atendo ao farol";
                break;
            case "verde":
                resultado = "Pode passar";
        }
        System.out.println(resultado);
    }
}
