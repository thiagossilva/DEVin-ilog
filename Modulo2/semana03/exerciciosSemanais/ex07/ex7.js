const playlist = [
    {
        nome: "Listen to your heart",
        cantor:"Roxette"
    },
    {
        nome: "Bloody Mary",
        cantor:"Lady Gaga"
    },
    {
        nome: "Bones",
        cantor:"Imagine Dragons"
    },
    {
        nome: "Sugar honey ice and tea",
        cantor:"Bring me the horizon"
    },
    {
        nome: "Rock you like a hurricane",
        cantor:"Scorpions"
    },
    {
        nome: "Pure/Honey",
        cantor:"Beyoncé"
    },
]


let tabela = document.getElementById("tbMusicas")
for (let obj of playlist) {
    let tr = tabela.insertRow();
    tr.insertCell().textContent = obj.nome;
    tr.insertCell().textContent = obj.cantor; 
}

localStorage.setItem("playlist", JSON.stringify(playlist))


function apagarPrimeiro() {
    let confirmar = window.confirm("Você deseja apagar a linha?")
    console.log(confirmar)
    if (confirmar === true) {
        document.getElementById("tbMusicas").deleteRow(1);
        let index = playlist.shift()
        playlist.splice(index, 0)
        localStorage.setItem("playlist", JSON.stringify(playlist))
    }
}

