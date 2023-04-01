import { useTheme } from "styled-components";
import { ButtonStyled } from "./styles";

function Button({ children }) {
  const theme = useTheme();
  console.log({ theme });

  return (
    <ButtonStyled color="white" primary>
      {children}
    </ButtonStyled>
  );
}

export default Button;