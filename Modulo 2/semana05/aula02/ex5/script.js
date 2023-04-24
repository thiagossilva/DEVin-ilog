import {soma} from "./soma.js"
import {subtracao} from "./subtracao.js"
import {multiplicacao} from "./multiplicacao.js"
import {divisao} from "./divisao.js"
import {escreveValor} from "./escreveValor.js";

escreveValor(soma(3, 5));
escreveValor(subtracao(5, 3));
escreveValor(multiplicacao(5, 5));
escreveValor(divisao(10, 2));