import PropTypes from "prop-types";

function Cabecalho({ titulo }) {
  return (
    <header id="id-cabecalho" className="teste-class-name">
      <h1>{titulo}</h1>
    </header>
  );
}

Cabecalho.propTypes = {
  titulo: PropTypes.string.isRequired,
};

export default Cabecalho;