const retornaMeuNome = async function () {    
    return "Thiago de Sousa"
}

async function imprimeNome() {
let nome = await retornaMeuNome();    
console.log(nome);
}

imprimeNome();