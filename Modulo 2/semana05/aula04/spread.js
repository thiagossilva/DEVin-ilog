// Spread em função

const imprimeNomes = function(nome1, nome2, nome3) {
    console.log(nome1);
    console.log(nome2);
    console.log(nome3);
}

const nomes = ["Thiago", "Gabi", "Luiz"];

imprimeNomes(...nomes);


// Spread em array

const arrayA = ["a", "b", "c"];
const arrayB = ["f", "g", "h"];

const arrayConcatenado = [...arrayA, "d", "e", ...arrayB];
console.log(arrayConcatenado);
