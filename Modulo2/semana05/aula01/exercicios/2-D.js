const calculadora = () => {
    const soma = function (a,b) {
        console.log('Você está somando',a, 'com', b);
        console.log('Resultado da soma', a + b);
    }

    return {
        soma,
        subtracao: (a, b) => {
            console.log('Você está subtraindo',b, 'de', a);
            console.log('Resultado da subtração', a - b);
        }
    }
}

const calc = calculadora();
calc.soma(2,2);
calc.subtracao(2,2);