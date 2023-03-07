import PropTypes from "prop-types";

const Botao = (props) => {
  const { children, sapato, arrayExemplo } = props;

  return (
    <div>
      <p>{sapato}</p>
      <button>{children}</button>
    </div>
  );
};

Botao.propTypes = {
  children: PropTypes.string.isRequired,
  sapato: PropTypes.string,
  // Exmeplo de definição mais complexa
  arrayExemplo: PropTypes.arrayOf(
    PropTypes.shape({
      id: PropTypes.number.isRequired,
      nome: PropTypes.string,
    })
  ),
};

Botao.defaultProps = {
  sapato: "ESTE-EH-UM-VALOR-PADRAO",
  arrayExemplo: [],
};

export default Botao;