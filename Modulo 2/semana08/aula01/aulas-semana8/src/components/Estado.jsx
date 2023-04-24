import { useState } from "react";

export const Estado = ({titulo, valorInicial = ""}) => {
    const [valor, setValor] = useState(valorInicial);
    const [carregando, setCarregando] = useState(false);
    const [contador, setContador] = useState(0);


    const handleChange = (event) => {
        console.log(event.target.value);
    };

    const handleContador = () => {
        setContador(contador + 1);
        setContador(contador + 1);
        setContador(contador + 1);
        setContador(contador + 1);
        setContador(contador + 1);
    }

    console.log(contador);

    if (carregando) {
        return <button onClick={() => setCarregando(false)}>Finalizado</button>
    };

    return (
        <>
            <h1>{titulo}</h1>
            <p>Valor: {valorInicial}</p>
           <input value={valorInicial} onChange={handleChange} />
           <button onClick={() => setCarregando(true)}>Iniciar</button>

           <hr />

           <p>Contador: {contador}</p>
           <button onClick={handleContador}>Contador</button>
        </>
    );
};