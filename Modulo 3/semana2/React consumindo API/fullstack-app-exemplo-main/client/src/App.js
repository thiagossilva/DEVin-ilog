import axios from 'axios';
import { useEffect, useState } from 'react';
import ListaPessoas from './components/ListaPessoas';
import CadastroPessoa from './components/CadastroPessoa';
import './App.css';

function App() {

  //FIXME: Extrair esta funcoes pra arquivo a parte e refatorar código 
  async function consultarPessoas() {
    try {
      const resp = await axios.get('http://localhost:8080/api/pessoas');
      setPessoas(resp.data);
    } catch (error) {
      console.log(error);
    }
  }

  const [pessoas, setPessoas] = useState([]);

  useEffect(() => {
    consultarPessoas()
      .catch(erro => console.log(erro));
  }, [])
  

  return (
      <div className="App">
       
        <ListaPessoas pessoas={pessoas} />
        <CadastroPessoa pessoas={pessoas} setPessoas={setPessoas} />
       
      </div>
    );



  // const [nomes, setNomes] = useState([]);

  // useEffect(() => {
  //   axios.get('http://localhost:8080/api')
  //     .then(resp => setNomes(resp.data))
  //     .catch(erro => console.log(erro));
  // }, [])
  

  // return (
  //   <div className="App">
     
  //     <ListaNomes nomes={nomes} />
  //     <CriaNome nomes={nomes} fcAdicionaNome={setNomes} />
     
  //   </div>
  // );
}

export default App;
