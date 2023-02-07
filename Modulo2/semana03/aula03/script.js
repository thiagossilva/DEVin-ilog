//========== Eventos =============
//========== onclick =============
function clickFunction() {
    alert("Opa clicou de novo");
  }
  //========== onchange =============
  function change() {
    document.getElementById("try").innerHTML += "Valor trocado <br>";
  }
  //========== onmouseover =============
  function mouseOver() {
    document.getElementById("try").innerHTML += "Passou o mouse <br>";
  }
  //========== onmousedown e onmouseup =============
  function mouseDown() {
    document.getElementById("try").innerHTML = "Botão pressionado <br>";
  }
  function mouseUp() {
    document.getElementById("try").innerHTML = "Soltou o botão <br>";
  }
  //========== onkeydown e onkeyup =============
  function keyDown() {
    document.getElementById("try").innerHTML += "Tecla pressionada <br>";
  }
  function keyUp(event) {
    console.log(event);
    document.getElementById("try").innerHTML += "Tecla liberada <br>";
  }
  //========== parâmetro event e evento onsubmit =============
  function submitForm(e) {
    //a variável e recebe o evento e todos os suas propriedades
    console.log(e);
    e.preventDefault(); //previne que o evento de formulário faça seu comportamento padrão
    console.log("Enviado com sucesso");
  }
  let form = document.getElementById("formulario");
  
  //========== Criando um elemento e adicionando eventos =============
  let button = document.createElement("button");
  // <button></button>
  button.innerHTML = "Enviar";
  // <button>Clique aqui</button>
  button.type = "button";
  // <button type="button">Clique aqui</button>
  button.addEventListener("click", function (e) {
    //Para adicionar um evento de click e forma dinamica
    alert("Opa clicou");
  });
  // <button type="button" onclick="function(event)">Clique aqui</button>
  
  form.appendChild(button);
  