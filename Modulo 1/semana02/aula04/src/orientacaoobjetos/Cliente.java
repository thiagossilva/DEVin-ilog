package orientacaoobjetos;

class Cliente {
    String nome;
    String sobremnome;
    Long cpf;

    public String toString() {
        return nome + " " + sobremnome + ", cpf " + cpf;
    }
}
