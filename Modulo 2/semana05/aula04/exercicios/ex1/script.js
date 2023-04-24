const soma = function(...numeros) {
    let total = 0
    numeros.forEach(numero => total += numero);
    return total;
}

const total = soma(1,2,3,4,5);
console.log(total);