export default function escrevaValor(valor) {
  const valorTexto = document.createElement('h1');
  valorTexto.innerText = valor;
  document.body.appendChild(valorTexto);
}
