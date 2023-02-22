const somaAsync = function (a, b) {

    if (a > 10 || b > 10) {
        return Promise.reject("Números não permitidos")
    }

    return Promise.resolve(a + b);
};


somaAsync(5, 3).then(resultado => console.log("O resultado é", resultado));
somaAsync(11, 2).catch(error => console.log(error))