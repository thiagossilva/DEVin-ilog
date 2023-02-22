class Impressora {
    constructor(listaDeTextos) {
        this._textos = listaDeTextos;
        this._data = new Data;
    }

    imprime() {
        this._textos.forEach(function(texto)  {
            console.log("imprimindo o texto", texto, "em:", this._data);
        });
    }
}

const textos = ["Olá", "Tudo bem?", "como vai vc?"]