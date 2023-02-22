export default function multiplicacao(a, b) {
    const resultado = a * b;
    console.log('Resultado da multiplicacao', resultado);
    const valorTexto = document.createElement('h1');
    valorTexto.innerText = `Valor de A x B = ${resultado}`;;
    document.body.appendChild(valorTexto);
};