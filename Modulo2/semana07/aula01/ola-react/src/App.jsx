function Button({texto}) {
  return <button>{texto}</button>;
}


function App() {

  const texto = "Texto em variáveis";
  return (
    <div
      id="idddd"
      className="teste"
      style={{
        backgroundColor: "red",
      }}
    >
      <h1>Olá React!</h1>
      <h2>Bah...</h2>
      <h2>{texto}</h2>
      <Button texto="Botãozin"/>
    </div>
  );
}

export default App;
