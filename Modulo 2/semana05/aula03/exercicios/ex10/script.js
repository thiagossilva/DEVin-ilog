const retornaMeuNome = async function () {
    throw new Error('Um erro qualquer');
}

async function imprimeNome() {
    try {
        await retornaMeuNome();
    } catch (error) {
        console.log('Deu ruim:', error.message);
    }
}

imprimeNome();