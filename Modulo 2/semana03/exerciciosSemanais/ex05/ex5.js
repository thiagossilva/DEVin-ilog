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
let table = document.querySelector("#tbMusicas")
for (let obj of playlist) {
    let tr = table.insertRow(-1);
    tr.insertCell().textContent = obj.nome;
    tr.insertCell().textContent = obj.cantor; 
}

// let tabela = document.getElementById("tbMusicas")
// for (let valores of playlist) {

//     console.log(valores)
    
    
// }

