import Cabecalho from "./components/Cabecalho";
import Principal from "./components/Principal";
import Rodape from "./components/Rodape";

// Definição do componente App
function App() {
  const texto = "Bah... texto embutido!";

  // Todo componente deve retornar JSX
  return (
    <div>
      <Cabecalho titulo="BlogDiH" />
      <Principal />
      <Rodape />
    </div>
  );
}

export default App;