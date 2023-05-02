import axios from "axios"
import { useRef, useState } from "react"

export default function CadastroPessoa( {pessoas, setPessoas} ) {

    const nomeRef = useRef();
    const idadeRef = useRef();

    const [mensagem, setMensagem] = useState('');

    //FIXME: exportar funcao para arquivo especifico pde chamadas de API (refactor)
    async function handleAdicionar() {
        const nome = nomeRef.current.value;
        const idade = idadeRef.current.value;
        if (!nome || !idade || idade <=0) {
            alert('Dados incompletos ou inválidos!');
            return;
        }
        try {
            const resp = await axios.post('http://localhost:8080/api/pessoas', { nome, idade: +idade });
            const nova = resp.data;
            setPessoas( [...pessoas, nova] );
            setMensagem('');
            nomeRef.current.value = '';
            idadeRef.current.value = '';
        } catch (error) {
            if (error.response.status === 500) {
                setMensagem('Erro no servidor!');
            } else if (error.response.status >= 400 && error.response.status <= 499) {
                setMensagem(error.response.data.erro);  // error.response.data tem o atributo erro colocado pela API
            } else {
                setMensagem(error.message);
            }
        }  
    }

  return (
    <div>
        <h1>Cadastro de Pessoa</h1>
        <div>
            <label>Nome:</label>
            <input type='text' placeholder="nome..." ref={nomeRef} />
            <br/>
            <label>Idade:</label>
            <input type='number' ref={idadeRef} />
            <br/> 
            <input type='button' value="Adicionar" onClick={handleAdicionar} />
        </div>
        <p>{mensagem}</p>
    </div>
  )

}