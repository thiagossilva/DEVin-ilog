const meusFilmes = ['matrix', 'Rambo', 'Toy Story', 'it - a coisa'];


// Function padrão
// meusFilmes.forEach(function (filme, indice) {
//     console.log(`Meu filme ${filme} está na posição ${indice}`);
// })


// Arrow
meusFilmes.forEach((filmes,indice) => console.log(`Meu filme ${filmes} está na posição ${indice}`))