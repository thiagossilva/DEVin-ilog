

//Operadores matemáticos
var soma = 1+1; //soma = 2
var subtracao = 2-1; //subtracao = 1
var multiplicao = 2*2 // multiplicao = 4
var divisao = 20/10 //divisao = 2
var exponenciacao = 2 ** 8 //exponenciacao = 256
var resto = 20%2 // resto = 0

//Operadores de atribuição
var somaAtribuicao = 3;
somaAtribuicao += 4; //mesma coisa disso -> somaAtribuicao = somaAtribuicao + 4
console.log(somaAtribuicao);

//Operadores de comparação
var maior = 10 <= 10;
var diferente = 10 != "10" // true; 
var diferente2 = 10 !== "10" // false;
//OBS:
// != / ==     Valida somente o resultado
// !== / ===   Valida o resultado e o tipo do dado

//Operadores lógicos
// TABELA VERDADE AND (&&)
// true  | true  = true
// true  | false = false
// false | true  = false
// false | false = false

var primeiraOperacao = 2 > 1; //true
var segundaOperacao = 2 > 4; //false
var resultado = primeiraOperacao && segundaOperacao; 
console.log(resultado); //false


// TABELA VERDADE OR (||)
// true  | true = true
// true  | false = true
// false | true = true
// false | false = false

var primeiraOperacao2 = 2 > 1; //true
var segundaOperacao2 = 2 > 4; //false
var resultado2 = primeiraOperacao || segundaOperacao;
console.log(resultado2); //true

// TABELA VERDADE NOT (!)
// !true  = false
// !false = true
var open = true;
open = !open; 
console.log(open); //false



//CONDICIAL IF 
//Só possui a possibilidade de entrar em uma das condições
if (idade > 18) { // se for maior que 18
    console.log('É maior de idade');
}else{ // entra caso não atenda a condição if
    console.log('É menor de idade'); 
}

//Condicional aninhada
var idade = 17;
if (idade > 18) { // se for maior que 18
  console.log('É maior de idade');
}else if(idade == 18){ // se for igual a 18
  console.log('É maior de idade esse ano e a partir dele');
}else if(idade < 18){ // se for menor que 18
  console.log('É menor de idade');
}


//EXERCÍCIO SLIDE 16 - DIA 02 - SEMANA 02
var nota1 = parseInt(window.prompt("Nota 01:"));
var nota2 = parseInt(window.prompt("Nota 02:"));

function somar(nota1, nota2){
    return nota1 + nota2;
}

var result = somar(nota1, nota2);

if(result == 10){
    document.write("Você arrasou, aprovado com excelência");
}else if(result >= 7){
    document.write("Aprovado");
}else if(result < 7){
    document.write("Reprovado");
}


//IF TERNÁRIO
// Serve para reduzir um if simples (if(){} else {})
//OBS: Só usa se tiver uma unica linha em cada bloco 

(result == 10) ? document.write("Você arrasou, aprovado com excelência") : document.write("Aprovado");
// Substitui 
// if(result == 10){
//     document.write("Você arrasou, aprovado com excelência");
// }else {
//     document.write("Aprovado");
// }

//Exemplo 2
open = (open) ? false : true;
// Substitui
// if(open == true){
//     open = false;
// }else{
//     open = true;
// }


//SWITCH CASE
//A nível de processamento o else if ou if else é mais recomendável 
//que um switch case (dependendo da quantidade de if else)

var fruta = 'morango';
switch (fruta) {
  case 'banana':
    console.log('Banana: R$10,00');
    break;
  case 'uva':
    console.log('Uva: R$5,00');
    break;
  case 'laranja':
    console.log('Laranja: R$8,00');
    break;
  default: // entra no bloco default caso não entre em nenhum case 
    console.log('Fruta desconhecida');
 }




