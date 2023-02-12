// Exercícios Find

const array = [10, 5, 60, 3, 55, 70, 21, 30]


// Ex 1
const acharNum = array.find(function (achar70) {
    return achar70 === 70
})

console.log("Número", acharNum)


// Ex 2
function acharValorArray(array, valor) {
    return array.find(function (valorBuscado) {
        return valorBuscado === valor
    })
}

let encontrado = acharValorArray(array, 10)
console.log(encontrado)