// Filtro de array

const notas = [5,6,2,4,8,7.9,9,10]

const aprovados = notas.filter(function (nota) {
    return nota >=7;
}) 

console.log("Aprovados", aprovados)

// Array Find
const filmes = [
    {
        nome: "matrix",
        nota: 6
    },
    {
        nome: "Poderoso Chefão",
        nota: 9
    },
    {
        nome: "A espera de um milagre",
        nota: 10
    }
]

const primeiroFilme = filmes.find( function(filme) {
    return filme.nota === 10
})

console.log("O Filme com nota 10 é", primeiroFilme)

// Array Every = retorna true se todos satisfazem a verificação

const notasEvery = [10, 7.5, 7, 8, 9]

const todosAprovados = notasEvery.every(function (nota) {
    return nota >=7
})

console.log("Todos os alunos foram aprovados", todosAprovados)

// Array some

const notasSome = [8, 7.5, 7, 8, 9]

const houveReprovados = notasSome.some(function(nota) {
    return nota < 7
})

console.log("Houve reprovados? ", houveReprovados)


// Map retorna uma nova lista com os valores atualizados
const listaDeNomesDeFilmes = filmes.map(function (filme) {
    return {nome: filme.nome, nota: filme.nota +1}
})

console.log(listaDeNomesDeFilmes)

const notasReduce = [8, 7, 6.4, 9, 3]

const total = notasReduce.reduce(function (totalNotas, nota) {
    return totalNotas + nota
}, 0)

console.log(total)