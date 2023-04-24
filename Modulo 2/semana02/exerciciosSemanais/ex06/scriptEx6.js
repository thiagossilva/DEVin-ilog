var altura = parseFloat(window.prompt("Digite sua Altura "))

var peso =  parseFloat(window.prompt("Digite seu peso"))

var imc = peso / (altura * altura)

if (imc >= 25) {
    window.alert("Você está acima do peso, procure um médico")
    document.write(imc)
} else if (imc >= 18.5 && imc <= 24.9) {
    document.write(`<h1>PARABÉNS!! Você está no peso ideal!</h1>`)
} else {
    document.write(`<h1>Você está abaixo do peso, procure um médico </h1>`)
}


