
const carros = [
    {
        nome: "escort xr3",
        valor: 10000,
        marca: "Ford",
    },
    {
        nome: "Chevette",
        valor: 8000,
        marca: "Chevrolet",
    },
{
        nome: "Landau",
        valor: 14000,
        marca: "Ford",
    },
    {
        nome: "Maverick",
        valor: 18000,
        marca: "Ford",
    },
];





const filtraCarros = carros.filter(carro => carro.marca === "Ford")

const carrosFord = []
filtraCarros.forEach(carro => carrosFord.push(carro.nome, carro.valor))
console.log(carrosFord)
