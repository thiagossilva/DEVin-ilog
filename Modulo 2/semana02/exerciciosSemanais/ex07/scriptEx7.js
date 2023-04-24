var avaliacoes = [];
var usuarios = 0;


while (usuarios < 4) {
    var avaliacao = window.prompt("Avalie como ruim, bom ou excelente")
    avaliacoes.push(avaliacao)
    usuarios++
}

document.write(`<h3>${avaliacoes} </h3><br>`)

var numClassificoes = 0;
for (i = 0; i < avaliacoes.length; i++) {
    if (avaliacoes[i] === "ruim") {
        numClassificoes++
    }
}

document.write(`<h4>${numClassificoes} avaliação como ruim</h4>`)

