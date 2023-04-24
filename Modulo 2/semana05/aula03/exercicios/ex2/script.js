function tempoDeProcessamentoAssincrono(cb) {
    const milliseconds = Math.random() * 5000;// vai simular tempo aleatórios entre 0 e 5 segundos
    setTimeout(() => cb(milliseconds / 1000), milliseconds);
}

function tempoAssinc(id) {   
    return new Promise(resolve => {
        tempoDeProcessamentoAssincrono(tempo => resolve(`Finalizando a execução ${id} em ${tempo} segundos`));
    });
}

tempoAssinc(1).then(texto => console.log(texto));
tempoAssinc(2).then(texto => console.log(texto));;
tempoAssinc(3).then(texto => console.log(texto));;