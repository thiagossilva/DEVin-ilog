import axios from 'axios';
import { useEffect, useState } from 'react';
import ListaPersonagens from './components/ListaPersonagens';
import './App.css';

function App() {

  const [personagens, setPersonagens] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/personagens')
      .then(resp => setPersonagens(resp.data))
      .catch(erro => console.log(erro));
  }, [])
  

  return (
    <div className="App">
      <h1>Lista de Personagens cadastrados</h1>
      
      <ListaPersonagens personagens={personagens} />

    </div>
  
  );
}

export default App;
