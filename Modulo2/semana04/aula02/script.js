class Div {
    constructor({texto}) {
        this.texto = texto;
        this.div = null
    }

    getDiv() {
        if (!this.div) {
            this.div = document.createElement("div")
            this.div.innerText = this.texto
        }
        return this.div
    }

    hierarquia(pai) {
        const div = this.getDiv()
        document.querySelector(pai).appendChild(div)
    }

    estilo(estilo) {
        const div = this.getDiv()
        div.classList.add(estilo)
    }
}


const personagens = [
    {
      nome: "Mario"
    },
    {
      nome: "Batman"
    },
    {
      nome: "Gon Freecss"
    }
]

const star = new Div({texto: "StarDex"})
star.hierarquia(".main")
star.estilo("meu-header")

const div1 = new Div({texto: personagens[0].nome})
div1.estilo("estilo-personagem")
div1.getDiv().onclick = function() {
    alert(personagens[0].nome)
    star.estilo("mario")
}
div1.hierarquia(".main")

const div2 = new Div({texto: personagens[1].nome})
div2.estilo("estilo-personagem")
div2.getDiv().onclick = function() {
    alert(personagens[1].nome)
    star.estilo("batman")
}
div2.hierarquia(".main")

const div3 = new Div({texto: personagens[2].nome})
div3.estilo("estilo-personagem")
div3.getDiv().onclick = function() {
    alert(personagens[2].nome)
    star.estilo("gon")
}
div3.hierarquia(".main")
