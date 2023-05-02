import './styles.css';

export default function ListaPersonagens( {personagens} ) {
  return (
    <div>
         {
          personagens.map(pers => 
              <div key={pers.id}>
                <span>{pers.nome} - {pers.serie}</span> <br/> 
              </div>
          )
        }
    </div>
  )
}