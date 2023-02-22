const soma = (a, b) => {
  const resultado = a + b;
  console.log('Resultado da soma', resultado);
};

const subtracao = (a, b) => {
  const resultado = a - b;
  console.log('Resultado da subtracao', resultado);
};

const multiplicacao = (a, b) => {
  const resultado = a * b;
  console.log('Resultado da multiplicacao', resultado);
};

const divisao = (a, b) => {
  const resultado = a / b;
  console.log('Resultado da divisao', resultado);
};

export default {
  soma,
  subtracao,
  multiplicacao,
  divisao,
}