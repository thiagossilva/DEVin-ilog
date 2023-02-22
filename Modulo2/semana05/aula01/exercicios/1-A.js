const meusNumeros = [1,2,3,4,5,6,7,8];


// Function normal
meusNumeros.forEach(function (numero) {
    console.log("meu numero é: ", numero)
})


// Arrow Function
meusNumeros.forEach(numero => console.log("meu número é:", numero))