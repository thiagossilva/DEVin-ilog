import axios from "axios";
import { useRef } from "react";

export default function CriaNome( {nomes, fcAdicionaNome} ) {

    const nomeRef = useRef();

    function handleSubmitCadastroNome(e) {
        e.preventDefault();
        const novoNome = nomeRef.current.value;
        if (!novoNome) {
            alert('Nome não preenchido!');
            return;
        }
        axios.post('http://localhost:8080/api', { 'nome': novoNome })
        .then(resp => fcAdicionaNome([...nomes, novoNome]))
        .catch(erro => console.log(erro));
        nomeRef.current.value = '';
    }


  return (
    <div className="cria-nome-container">
        <h3>Inclusão de novo nome</h3>
        <form onSubmit={handleSubmitCadastroNome}>
            <label>Digite o nome:</label>
            <input type="text" placeholder="nome" ref={nomeRef}/>
            <br/>
            <input type="submit" value="enviar" />
        </form>

    </div>
  )
}