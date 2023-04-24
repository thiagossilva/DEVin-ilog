const jogadoresSelecao94 = [
    {
        nome: 'Taffarel',
        posicao: 'Goleiro',
    },
    {
        nome: 'Jorginho',
        posicao: 'Lateral Direito',
    },
    {
        nome: 'Ricardo Rocha',
        posicao: 'Zagueiro',
    },
    {
        nome: 'Mauro Silva',
        posicao: 'Volante',
    },
    {
        nome: 'Bebeto',
        posicao: 'Atacante',
    },
    {
        nome: 'Romário',
        posicao: 'Atacante',
    },
    {
        nome: 'Dunga',
        posicao: 'Volante',
    },
];

const nomesJogadores = jogadoresSelecao94.map(function (nome) {
    return nome.nome
})

console.log(nomesJogadores)

const arrayNomes = []

jogadoresSelecao94.forEach(function (nome) {
    arrayNomes.push(nome.nome)
})

console.log(arrayNomes)