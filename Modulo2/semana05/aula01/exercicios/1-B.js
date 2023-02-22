const meusFilmes = ['matrix', 'Rambo', 'Toy Story', 'it - a coisa'];


// Function normal
// meusFilmes.forEach(function (filme, indice) {
//     console.log(`Meu filme ${filme} está na posição ${indice}`)
// })


// Arrow Function
meusFilmes.forEach((filme, indice) => console.log(`Meu filme ${filme} está na posição ${indice}`))