// let results = JSON.parse(`{"id": 1, "nome": "Thiago", "idade": 26, "turmas": [{"nome": "ilog"}]}`)
// let resultsObj = JSON.parse(json); //converte de json => objeto js
// let resultsString = JSON.stringify(JSON.parse(json)); //converte de objeto js => json
// console.log(resultsObj);
// console.log(resultsString);
// console.log(results)


let usuario = {
    nome: "Thiago",
    idade: 26,
    cidade: "São Paulo"
}

localStorage.setItem("usuario", JSON.stringify(usuario))

let tagP = document.getElementById("try");
// tagP.innerHTML = localStorage.getItem("usuario");

//Para pegar um item no localStorage
console.log(localStorage.getItem("idioma"));
console.log(JSON.parse(localStorage.getItem("usuario")));

//Para remover um item do localStorage
// localStorage.removeItem("idioma");
//Para apagar todo o localStorage
// localStorage.clear();

//============== timeout e interval ==============
let data;
setTimeout(() => {
  console.log("Entrei no Timeout");
  data = {
    nome: "Thiago",
    idade: 26,
    cidade: "São Paulo",
  };
}, 2000);

let interval = setInterval(function () {
  console.log("Entrei");

  if (data) {
    clearInterval(interval); // faz com que limpa o intervalo criado na linha 42
  }
}, 1000);