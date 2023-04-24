let favorito = document.getElementById("favoritar");
let titulo = document.getElementById("tituloComentario");
let descricao = document.getElementById("descricaoComentario");


function favoritar(){
    alert("O item foi adicionado a lista de favoritos!!!!!!!");
}

function verificar(){
    if (titulo.value.length <= 8) {
        titulo.style.border = "1px solid red";
    } else {
        titulo.style.border = "1px solid grey";
    }
}

function enviar(event){
    event.preventDefault();
    console.log(titulo.value, descricao.value)

}