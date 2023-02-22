export default function soma (a, b) {
    const resultado = a + b;
    console.log('Resultado da soma', resultado);
    const valorTexto = document.createElement('h1');
    valorTexto.innerText = `Valor de A + B = ${resultado}`;;
    document.body.appendChild(valorTexto);
};