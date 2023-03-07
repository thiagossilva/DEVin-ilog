export const Eventos = () => {
const handleChange = (event) => {
    console.log(event.target.value);
};

const handleKeyUp = (event) => {
    console.log(event.keyCode);
};

return (
    <div className="App">
        <h1>Olá react</h1>
        <input onChange={handleChange} onKeyUp={handleKeyUp} />
        <button onClick={(event) => console.log("Clicou")}>Clique aqui</button>
    </div>
)
}