export default function escrevaMeuNome(nome) {
    const meuNome = document.createElement('h1');
    meuNome.innerText = nome;
    document.body.appendChild(meuNome);
  }