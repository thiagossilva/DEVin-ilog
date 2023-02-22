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

export {
  soma as somar,
  subtracao as subtrair,
  multiplicacao as multiplicar,
  divisao as dividir
}