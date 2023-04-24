//Declaração de variáveis var no js
var numero1 = ["20", "30"];
var numero2 = "30";

//Print mais comum na aba console do navegador (para ativar - F12)
console.log("Turma ilog");
console.log(typeof numero1); //verificar o tipo da variável (string, number, object, boolean)


//window.prompt("Texto") - Abre uma caixa de texto com input (retorna undefined ou a string que você digitou);
var name = window.prompt("Qual o seu nome?");
console.log(name);


//window.confirm("Texto") - Abre uma caixa com confirmação (retorna ou "true" ou "false")
var nameBoolean = window.confirm("Meu nome é Thiago");
console.log(nameBoolean);

//window.alert("Texto") - Abre uma caixa de avisos
window.alert("Turma iLog");

// document.write() - pode receber um texto com tags HTML
document.write("<h1 class='red'>Turma iLog</h1>");

//slide 17 - dia 01 - semana 02
var firstName = window.prompt("Qual o seu primeiro nome?");
var secondName = window.prompt("Qual o seu segundo nome?");
document.write("<h1 class='red'>"+ firstName +" "+secondName +"</h1>");
console.log("Nome:"+firstName +" "+ secondName);


//Function
// Declaração sem parâmetros
function subtrair(){
    return 4-2;
}
subtrair();

// Declaração com parâmetros
function somar(valor1, valor2){
    //uso da palavra return para expecificar o retorno da função
    return valor1 +valor2; 
};
console.log(somar(12, 20));


//Exercício do slide 21 - dia 01 - semana 02
var nome = window.prompt("Digite o seu nome:");
convidar(nome);

function convidar(nome){
    var mensagem = `Convido ${nome} para o casamento de Junin e Aline.`;
    document.write(`<h1>${mensagem}</h1>`);
}