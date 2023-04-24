const array =  [1,3,5,7,9,11,13,15]

const impares = array.every(function (impar) {
    return impar % 2 === 1
})

console.log("Todos os números são impares?", impares)


let numImpares = true
array.forEach(function (impar) {
    if (!numImpares) {
        return;
    }

    if (impar % 2 === 0) {
        numImpares = false
    }
})

console.log("forEach", numImpares)