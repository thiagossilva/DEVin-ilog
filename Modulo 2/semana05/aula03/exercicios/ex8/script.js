const somaAsync = async function (a, b) {
    if (a > 10 || b > 10) {
        throw new Error('Números não permitidos');
    }

    return a + b;
}

async function calcula() {
    let resultado = await somaAsync(2, 2);
    resultado = await somaAsync(resultado, 2);
    resultado = await somaAsync(resultado, 2);
    console.log(resultado);
}

calcula();

//bonus - testando o reject nesta forma
somaAsync(20, 50).catch(error => console.log(error.message))