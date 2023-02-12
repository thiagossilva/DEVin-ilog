const array =  [1,3,5,7,9,11,13,15]

const saoPares = array.some(function (pares) {
    return pares % 2 === 0
})

console.log("Tem algum par?", saoPares)

const array2 = [1,3,5,7,9,12,13,15] 

const saoPares2 = array2.some(function (pares) {
    return pares % 2 === 0
})

console.log("Tem algum par? Segunda verificação", saoPares2)

