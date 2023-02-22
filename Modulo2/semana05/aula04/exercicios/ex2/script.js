const prefixos = function (prefixo, ...elementos) {
    elementos.forEach(elemento => console.log(`{${prefixo} - ${elemento}}`))
}

prefixos("T", "1", "3", "X", "R1");