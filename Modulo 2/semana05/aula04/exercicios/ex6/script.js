const departameto = {
    nome: 'RH',
    gerente: 'Franscisco Ferdinando',
}

const descricaoDerpartamento = {
    ...departameto,
    numeroDeFuncionarios: 53,
    empresa: "nestle"
}

console.log(descricaoDerpartamento);