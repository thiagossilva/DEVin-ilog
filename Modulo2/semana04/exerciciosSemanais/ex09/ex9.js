const jogadoresSelecao94 = [
    {
        nome: 'Taffarel',
        posicao: 'Goleiro',
    },
    {
        nome: 'Jorginho',
        posicao: 'Lateral Direito',
    },
    {
        nome: 'Ricardo Rocha',
        posicao: 'Zagueiro',
    },
    {
        nome: 'Mauro Silva',
        posicao: 'Volante',
    },
    {
        nome: 'Bebeto',
        posicao: 'Atacante',
    },
    {
        nome: 'Romário',
        posicao: 'Atacante',
    },
    {
        nome: 'Dunga',
        posicao: 'Volante',
    },
];

let table = document.querySelector("#tbJogadores")
for (let obj of jogadoresSelecao94) {
    let tr = table.insertRow(-1);
    tr.insertCell().textContent = obj.nome;
    tr.insertCell().textContent = obj.posicao; 
}

// let tabela = document.getElementById("tbMusicas")
// for (let valores of playlist) {

//     console.log(valores)
    
    
// }