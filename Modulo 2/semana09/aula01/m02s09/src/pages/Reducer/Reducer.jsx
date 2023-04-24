import { useReducer } from "react";


function reducerContador(state, action) {
    console.log({ state, action });

    switch (action.type) {
        case "incrementa":
            return state + 1;

        case "decrementa":
            return state - 1;

        case "dobra":
            return state * 2;

        case "divide":
            return state / 2;

        default:
            return action;
    };
};

function Reducer() {
    const [contador, dispatchContador] = useReducer(reducerContador, 0);

    return (
        <div>
            <p>
                Valor contador: <span>{contador}</span>
            </p>
            <button onClick={() => dispatchContador({ type: "incrementa" })}>+</button> <br />
            <button onClick={() => dispatchContador({ type: "decrementa" })}>-</button> <br />
            <button onClick={() => dispatchContador({ type: "dobra" })}>*</button> <br />
            <button onClick={() => dispatchContador({ type: "divide" })}>/</button>
        </div>
    );
};
export default Reducer;