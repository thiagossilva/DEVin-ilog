function escritorDeNome(primeiroNome,  sobreNome, ...nomesDoMeio){
    let nomeCompleto = primeiroNome + ' ' + nomesDoMeio.join(' ') + ' ' + sobreNome;
    return nomeCompleto;
}

console.log(escritorDeNome("Thiago", "Silva", "Sousa"));