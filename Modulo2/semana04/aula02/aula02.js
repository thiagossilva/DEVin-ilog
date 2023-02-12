// Construtor com herança em JS
class Animal {
    constructor(nome) {
        this.nome = nome
    }

    printarNome () {
        console.log(this.nome)
    }
}

class Gato extends Animal {
    constructor(nome) {
        super(nome)
    }

    printarNome() {
        console.log("Eu sou um gato e meu nome é:", this.nome)
    }
}

const cachorro = new Animal("Cachorro")
cachorro.printarNome()

const animal = new Gato("Jhin")
animal.printarNome()

