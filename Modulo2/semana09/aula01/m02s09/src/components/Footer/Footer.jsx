import { useUserInfoContext } from "../../UserInfoContext";
import "./Footer.css";

import "./Footer.css";

function Footer() {
  const [userInfo] = useUserInfoContext();

  const mudaNome = () => setUserInfo({ name: "Thiaguinho" });

  return (
    <footer className="footer-container">
      <p>DiH | 2023 | {userInfo.name}</p>
      <button onClick={mudaNome}>Muda Nome</button>
    </footer>
  );
}

export default Footer;