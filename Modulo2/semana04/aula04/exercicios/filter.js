// Exercicio Filter
const array = [10,5,60,3,55,70,21,30]

const maiorQue21 = array.filter(function (maior) {
    return maior >= 21
})

console.log("Números maiores ou iguais a 21", maiorQue21)

const arrayDados =  [
    { nome: 'Luis', idade: 45 },
    { nome: 'Karina', idade: 43 },
    { nome: 'Pedro', idade: 12 },
    { nome: 'João', idade: 6 }
]

const idadeMaior18 = arrayDados.filter(function (idadeMaior) {
    return idadeMaior.idade >= 18
})

console.log("Pessoas maiores de 18", idadeMaior18)