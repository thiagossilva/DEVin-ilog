import { useContext } from "react";
import { Link } from "react-router-dom";
import UserInfoContext from "../../UserInfoContext";

import "./Header.css";

function Header() {
  const [userInfo] = useContext(UserInfoContext);

  return (
    <header className="header-container">
      <h1>Módulo 2 Semana 9</h1>
      <p>Olá, {userInfo?.name ?? "Sem nome"}</p>
      <nav>
        <Link to="/">Início</Link>
        <Link to="/contact">Contato</Link>
      </nav>
    </header>
  );
}
export default Header;