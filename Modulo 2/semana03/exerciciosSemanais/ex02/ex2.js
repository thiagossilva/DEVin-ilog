

function somar() {
    let input1 = document.querySelector("#input1").value
    let input2 = document.querySelector("#input2").value
    let resultado = document.getElementById("resultado")
    let valor1 = Number(input1)
    let valor2= Number(input2)
    let total = valor1 + valor2
    resultado.innerText = `A soma de ${valor1} + ${valor2} é ${total}`
}


function subtrair() {
    let input1 = document.querySelector("#input1").value
    let input2 = document.querySelector("#input2").value
    let resultado = document.getElementById("resultado");
    let valor1 = Number(input1)
    let valor2= Number(input2)
    let total = valor1 - valor2
    resultado.innerText = `A subtração de ${valor1} + ${valor2} é ${total}`
}