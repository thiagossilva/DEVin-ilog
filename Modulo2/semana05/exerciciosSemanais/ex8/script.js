
function fakeAPIFilmes(idRequisição) {
    const filmes = {
        1: "Matrix",
        2: "O poderoso Chefão",
        3: "A espera de um milagre",
        4: "O clube da luta",
        5: "Coração valente",
        6: "O rei leão",
        7: "Forrest Gump - O Contador de Histórias",
        8: "Os bons companheiros",
        9: "O irlândes",
        10: "Um sonho de liberdade",
    };

    
    return new Promise(resolve => {
        const tempoDeResposta = Math.random() * 5000;
        setTimeout(() => resolve({filmes: filmes[idRequisição], tempo: tempoDeResposta}), tempoDeResposta)
    });
}

const requisicoes = [1,2,3,4,5,6,7,8,9,10];

for (const req of requisicoes) {
    fakeAPIFilmes(req).then(dado => console.log(req, dado.filmes, dado.tempo));
}