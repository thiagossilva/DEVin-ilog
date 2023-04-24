var nome = window.prompt("Digite seu nome")
var notas = []
var prova = 0


while (prova < 4) {
    var nota = parseInt(window.prompt("Digite a nota da prova"))
    notas.push(nota)
    prova++
}

var notaTotal = 0
for (i = 0; i < notas.length; i++) {
    notaTotal = notaTotal + notas[i]
}
notaMedia = notaTotal / 4
document.write(`<h2>O aluno ${nome} teve a média: ${notaMedia}</h2`)