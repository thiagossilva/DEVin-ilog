function pessoa () {
    const nome = "Thiago"
    const idade = 26

    return {
        getIdade: function() {
            return idade
        },
        getNome: function() {
            return nome
        }
    }
}

const p = pessoa()

console.log(p.getIdade)