const somaAsync = function (a, b) {
    return new Promise((resolve, reject) => {
        if (a > 10 || b > 10) {
            return reject('Números não permitidos');
        }

        return resolve(a + b);
});
}

somaAsync(2,2).then(r1 => somaAsync(r1, 2)).then(r2 => somaAsync(r2,2))
.then(console.log);
