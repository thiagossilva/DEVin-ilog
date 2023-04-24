import { Link, useNavigate } from "react-router-dom";
import { useUserInfo, useSetUserInfo } from "../../hooks/useUserInfo";
import "./Navbar.css";
import Button, { BUTTON_VARIANT } from "../Button";

function Navbar() {
  const navigate = useNavigate();
  const setUserInfo = useSetUserInfo();
  const userInfo = useUserInfo();

  const handleNavigateLogin = () => {
    navigate("/login");
  };

  const handleLogout = () => {
    setUserInfo();
    handleNavigateLogin();
  };

  return (
    <header className="navbarContainer">
      <Link to="/" className="navbarLogoBox">
        <img src="/logo.png" alt="Logo" />
        <h1>DEVinCursos</h1>
      </Link>
      {userInfo?.name ? (
        <Button variant={BUTTON_VARIANT.PRIMARY_OUTLINED} onClick={handleLogout}>
          Sair
        </Button>
      ) : (
      <Button variant={BUTTON_VARIANT.PRIMARY_OUTLINED} onClick={handleNavigateLogin}>
        Entrar
      </Button>
      )}
    </header>
  );
}

export default Navbar;