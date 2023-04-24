import styled from "styled-components";

export const ButtonStyled = styled.button`
  padding: 10px 20px;
  cursor: pointer;
  background-color: ${({ primary, theme }) =>
    primary ? theme.colors.primary : "blue"};
  color: ${({ color }) => color ?? "black"};
  &:hover {
    background-color: var(--primary);
  }
`;

export const ButtonReStyled = styled(ButtonStyled)`
  background-color: orange;
`;