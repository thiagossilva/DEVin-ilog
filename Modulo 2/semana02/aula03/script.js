//LAÇO FOR
var array = ["Thiago", "Simone", "Luana"];
console.log(array.indexOf("Thiago")); // Para saber qual a posição do item "Fabiane"

//Estrutura do laço for
for(var i=0; i < array.length; i++){
    console.log(array[i]); //Imprime intem por item da posição 0 a 4
}


//FOR OF 
var vogais = ['a', 'e', 'i', 'o', 'u'];
//antes do of é declarado uma variável que recebe cada item do laço
//depois do of ficará o array
for (var vogal of vogais) {
  //Imprime item por item sem a ajuda da variável de incremento
  console.log("Element: ", element); 
}