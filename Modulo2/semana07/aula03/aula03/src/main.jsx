import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

// Elemento que servirá de raiz para o React
const elementoRaiz = document.getElementById("raiz-do-app");

// Inicialização da raiz React no elemento
const reactRoot = ReactDOM.createRoot(elementoRaiz);

// Chamada do método render que tranformará o JSX em HTML
reactRoot.render(
  <React.StrictMode>
    {/* Comentário dentro de JSX */}
    {/* Componente App sendo utilizado com parâmetros */}
    <App />
  </React.StrictMode>
);
