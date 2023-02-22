function calculadora() {
    const soma = function (a, b) {
        console.log("resultado da soma", a + b);
    }
    return {
        soma,
        subtracao: function (a, b) {
            console.log("Resultado da subtação", a - b);
        }
    }
}

const calc = calculadora();
calc.soma(2,2)
calc.subtracao(3,2)

calculadora2 = () => {
    const somar =  (a,b) => {
        console.log("Resultado da soma", a+b)
    } 
    return {
        somar,
        subtracao: (a,b) => {
            console.log("Resultado da subtração", a - b)
        }
    }  
}

const calcular = calculadora2()
calcular.somar(3,3)
calcular.subtracao(5,2)