function carregar() {
    import('./calculadora.js').then(({ default: calculadora }) => {
        calculadora.soma(2, 2);
        calculadora.subtracao(2, 2);
        calculadora.multiplicacao(2, 2);
        calculadora.divisao(2, 2);
    });
}

carregar();