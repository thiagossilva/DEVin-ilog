var produtos = []
var opcao = 0;
var qtd = 0;

while (opcao != 6) {
    opcao = parseInt(window.prompt("Escolha o produto (1)Hortifruti (2)Laticínios (3)Carnes (4)Peixes (5)Aves (6)Fechar pedido"
    ))

    if (opcao === 1) {
        qtd = parseInt(window.prompt("Digite a quantidade de Hortifrutis"))
        produtos[0] = qtd;
    } else if (opcao === 2) {
        qtd = parseInt(window.prompt("Digite a quantidade de Laticínios"))
        produtos[1] = qtd;
    } else if (opcao === 3) {
        qtd = parseInt(window.prompt("Digite a quantidade de Carnes"))
        produtos[2] = qtd;
    } else if (opcao === 4) {
        qtd = parseInt(window.prompt("Digite a quantidade de Peixes"))
        produtos[3] = qtd;
    } else if (opcao === 5) {
        qtd = parseInt(window.prompt("Digite a quantidade de Aves"))
        produtos[4] = qtd;
    } 
}
document.write(produtos)

var maior = produtos[0]

for (i = 0; i < produtos.length; i++) {
    if (produtos[i] > maior) {
        maior = produtos[i]
    }
}

document.write(`<br> <h3>A maior quantidade de produtos = ${maior}</h3>`)

