//import Botao from "./Botao";
//import tuxJpg from "../assets/tux.jpg";

import ToDo from "./ToDo";

function Principal(prop) {
  // console.log("Este é o Principal");
  // console.log(prop);
  const tamanho = 60;

  return (
    <main>
      <ToDo descricao="Batata" concluido />
      <ToDo descricao="Arroz" concluido={true} />
      <ToDo descricao="Sapato" />

      <h2
        style={{
          backgroundColor: "red",
          fontSize: `${tamanho}px`,
          opacity: 0.5,
          display: "none",
        }}
      >
        Estou aprendendo React!
      </h2>

      {/* <img src="/images/tux.jpg" alt="tux-url" /> */}
      {/* <img src={tuxJpg} alt="tux-imported" /> */}
    </main>
  );
}

export default Principal;
