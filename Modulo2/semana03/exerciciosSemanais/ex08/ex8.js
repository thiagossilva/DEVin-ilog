let input = document.getElementById("texto")
let tagP = document.getElementById("insereTexto")

function adicionar() {
     tagP.innerHTML = input.value
    }

function salvarMensagem() {
    if(input.value.length){
        localStorage.setItem("valorTexto", input.value)
    }else{
        tagP.innerHTML = "Você deve digitar algum valor no campo acima"
    }
}

function mostrarMensagem() {
    let temValorTexto = localStorage.getItem("valorTexto")

    if(temValorTexto){
        tagP.innerHTML = temValorTexto
    }else{
            tagP.innerHTML = "Não tem texto salvo no local storage"
    }
}