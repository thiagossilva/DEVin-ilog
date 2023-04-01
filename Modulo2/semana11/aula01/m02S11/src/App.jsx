import { useState } from "react";
import Button from "./components/Button";
import { ThemeProvider } from "styled-components";
import { temaUm, temaDois } from "./styles";

function App() {
  const [isDark, setIsDark] = useState(false);

  return (
    <ThemeProvider theme={isDark ? temaDois : temaUm}>
      <div className="App">
        <h1>m02s11 - bootstrap</h1>
        <Button>BOTÃO COM ESTILOS</Button>
      </div>
    </ThemeProvider>
  );
}

export default App;