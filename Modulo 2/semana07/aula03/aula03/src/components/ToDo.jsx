import { useState } from "react";
import PropTypes from "prop-types";

function ToDo({ descricao, concluido }) {
  const [checado, setChecado] = useState(concluido);

  function clicou(event) {
    console.log("clicou", event.target);
    setChecado(!checado);
  }

  return (
    <div>
      <input type="checkbox" onChange={clicou} checked={checado} />
      <span style={{ textDecoration: checado ? "line-through" : "none" }}>
        {descricao}
      </span>
      <button>🗑️</button>
    </div>
  );
}

ToDo.propTypes = {
  descricao: PropTypes.string.isRequired,
  concluido: PropTypes.bool,
};

ToDo.defaultProps = {
  concluido: false,
};

export default ToDo;