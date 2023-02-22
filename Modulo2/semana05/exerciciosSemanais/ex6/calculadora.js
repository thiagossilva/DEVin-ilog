import soma from "./soma.js"
import subtracao from "./subtracao.js";

class Calculadora {
    somar(a, b) {
        soma(a, b)
    }

    subtrair(a,b) {
        subtracao(a, b)
    }
}

export const somar = Calculadora.prototype.somar

export default new Calculadora();
