const concatenaTexto = function(texto) {
    let textoOriginal = "";
    return new Promise(function(resolve) {
        textoOriginal += ` | ${texto}`
        return resolve(textoOriginal)
    })
}

concatenaTexto("Oie tudo bem?").then(concetenacao => {
    console.log(concetenacao)
})