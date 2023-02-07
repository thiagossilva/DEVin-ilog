let time = 30
let exibirTimer = document.getElementById("exibeTimer")

let timer = setInterval(() => {
    if (time >= 0) {
        exibirTimer.innerHTML = time--
    }
}, 1000);

