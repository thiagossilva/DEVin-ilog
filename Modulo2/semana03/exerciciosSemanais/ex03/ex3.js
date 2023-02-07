function mudarCor() {
    let corInput = document.getElementById("cores").value
    let corAtual = document.getElementById("corAtual")
    let div = document.getElementById("quadrado")
    corAtual.innerText = `cor atual = ${corInput}`
    div.style.background = corInput
}