function tempoDeProcessamentoSincrono() {
    const milliseconds = Math.random() * 5000;// vai simular tempo aleatórios entre 0 e 5 segundos
    const start = new Date().getTime();
    let end = 0;
    while ((end - start) < milliseconds) {
        end = new Date().getTime();
    }
    return milliseconds / 1000;
}



function tempoSincrono(id) {
    const tempo = tempoDeProcessamentoSincrono();
    return console.log(`Finalizando a execução ${id} em ${tempo} segundos`)
}

tempoSincrono(1);
tempoSincrono(2);
tempoSincrono(3);