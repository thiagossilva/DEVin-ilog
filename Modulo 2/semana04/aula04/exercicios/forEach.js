const arrayNum = [1,3,5,7,9,11,13,15]
const arrayDados = [
    { nome: 'Luis', idade: 45 }, 
    { nome: 'Karina', idade: 43 }, 
    { nome: 'Pedro', idade: 12 }, 
    { nome: 'João', idade: 6 }
]
const arrayNum2 = [
    [1,2,3,4,5],
    [6,7,8,9,10],
    [11,12,13,14,15]
] 

for (let i = 0; i < array.length; i++) {
    console.log(array[i])
}

console.log("for of")
for (const valor of array) {
    console.log(valor)
}  

console.log("forEarch")
array.forEach(el => console.log(el))

arrayDados.forEach(el => console.log(`Meu nome é ${el.nome} e tenho ${el.idade} anos`))
arrayNum2.forEach(el => console.log(el))