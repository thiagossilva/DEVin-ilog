// const array =  [
//     { nome: 'Luis', idade: 45 },
//     { nome: 'Karina', idade: 43 },
//     { nome: 'Pedro', idade: 12 },
//     { nome: 'João', idade: 6 }
// ]

// const total = array.reduce(function (totalIdades, idade) {
//     return totalIdades + idade.idade
// }, 0)

// console.log("A soma das idades é", total)

// const notas =  [7,9.3,6.8,8,10,3.5]

// const media = notas.reduce(function (mediaNotas, nota) {
//     return mediaNotas + nota / notas.length
// }, 0)

// console.log("A média das notas é:", media)

let lista = [100, 5, 10, 2];
const l2 =lista.reduce((x, y) => x % y == 0 ? x / y : x * y);
console.log(l2);