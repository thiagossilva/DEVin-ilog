import { useEffect, useState } from "react";



function PesquisaApi() {
  const [busca, setBusca] = useState('');
  const [resultado, setResultado] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  let baseUrl = "https://hn.algolia.com/api/v1/search?query=";
  const handleOnChange = (event) => {
    setBusca(event.target.value)
  };
  useEffect(() => {
    setIsLoading(true);
    fetch(`https://hn.algolia.com/api/v1/search?query=${busca}`)
      .then((response) => response.json())
      .then((value) => {
        setResultado(value.hits)
        setIsLoading(false)
      });
  }, [busca]);
  return (
    <>
      <h1>Pesquise aqui</h1>
      <input type="text" onChange={handleOnChange} value={busca} />
      {isLoading ? <p>Carregando...</p> :
        <ul>
          {resultado.map((sapato, index) => <li key={index}><a href={sapato.url} target="_blank">{sapato.title}</a></li>)}
        </ul>
      }
    </>
  )
}
export default PesquisaApi;