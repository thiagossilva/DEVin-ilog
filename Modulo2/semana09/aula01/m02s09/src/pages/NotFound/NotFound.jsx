import { Link } from "react-router-dom";
import "./NotFound.css";

function NotFoundPage() {
  return (
    <main className="contactpage-container">
      <h2>Página não encontrada</h2>
      <p>
        Volte para a página inicial clicando <Link to="/">aqui</Link>.
      </p>
    </main>
  );
}

export default NotFoundPage;