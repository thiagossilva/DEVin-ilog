package tech.devinhouse.heranca;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal = new Gato();

        animal.nome = "garfield";
        String somDoAnimal = animal.emitirSom();
        System.out.println(somDoAnimal);
    }
}
