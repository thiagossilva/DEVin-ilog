const array =  [
    { nome: 'Luis', idade: 45 },
    { nome: 'Karina', idade: 43 },
    { nome: 'Pedro', idade: 12 },
    { nome: 'João', idade: 6 }
]

const nomes = array.map(function (nome) {
    return nome.nome
})

console.log(nomes)

const pessoas = []

array.forEach(function(pessoa) {
    pessoas.push(pessoa.nome, pessoa.idade)
})

console.log(pessoas)

const nomesDescricao = array.map(function (pessoa) {
    return `meu nome é ${pessoa.nome} e tenho ${pessoa.idade} anos`
})

console.log(nomesDescricao)