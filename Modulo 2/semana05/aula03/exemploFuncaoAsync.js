const funcaoAsync = async function() {
    return true;
}
funcaoAsync();
const resultado = funcaoAsync();
console.log(resultado);

async function leitor() {
    const resultado1 = await funcaoAsync()
    console.log(resultado1);

}

leitor();