function tempoDeProcessamentoAssincrono(cb) {
    const milliseconds = Math.random() * 5000;// vai simular tempo aleatórios entre 0 e 5 segundos
    setTimeout(() => cb(milliseconds / 1000), milliseconds);
}

const resultado = requisicaoAssincrona(1);
console.log(resultado);

function requisicaoAssincrona (identificador) {
    return new Promise(resolve => {
        const chave = identificador * 7 + ' #um-hash'
        tempoDeProcessamentoAssincrono(() => resolve(chave));
    })
}

requisicaoAssincrona(1).then(console.log);
