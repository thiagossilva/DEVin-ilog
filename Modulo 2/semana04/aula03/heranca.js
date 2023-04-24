class Div {
    constructor() {        
        this.div = null
    }

    getDiv() {
        if (!this.div) {
            this.div = document.createElement("div")
        }
        return this.div
    }

    estilo(estilo) {
        const div = this.getDiv()
        div.classList.add(estilo)
    }

    hierarquia(pai) {
        const div = this.getDiv()
        document.querySelector(pai).appendChild(div)
    }
}
const div = new Div()
div.estilo("minha-div")
div.hierarquia(".meu-body")