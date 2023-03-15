import { useContext, useState } from "react";
import { Link } from "react-router-dom";
import UserInfoContext from "../../UserInfoContext";

import "./Home.css";

function HomePage() {
  const [userInfo, setUserInfo] = useContext(UserInfoContext);
  const [inputValue, setInputValue] = useState("");

  const handleInputChange = (event) => {
    const value = event.target.value;
    setInputValue(value);
  };

  const handleChangeName = () => {
    setUserInfo({ name: inputValue });
    setInputValue("");
  };

  return (
    <main className="HomePageContainer">
      <h2>Página inicial</h2>
      <ul>
        <li>
          <Link to="/details/sapato">Sapato</Link>
        </li>
        <li>
          <Link to="/details/gato">Gato</Link>
        </li>
      </ul>
      <input
        type="text"
        placeholder="Digite seu nome"
        value={inputValue}
        onChange={handleInputChange}
      />
      <button onClick={handleChangeName}>Trocar nome</button>
    </main>
  );
}

export default HomePage;