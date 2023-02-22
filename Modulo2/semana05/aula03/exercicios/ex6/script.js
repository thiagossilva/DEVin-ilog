const somaAsync = function (a, b) {
    return new Promise((resolve, reject) => {
        if (a > 10 || b > 10) {
            return reject('Números não permitidos');
        }

        return resolve(a + b);
});
}

somaAsync(5,3).then(resultado => console.log("O resultado é", resultado)).finally(() => console.log("Final da execução"));
somaAsync(11,2).catch(error => console.log(error)).finally(() => console.log("Final da execução"));