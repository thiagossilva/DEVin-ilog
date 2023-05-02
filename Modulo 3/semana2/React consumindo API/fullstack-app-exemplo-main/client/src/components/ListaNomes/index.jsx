import './styles.css';

export default function ListaNomes( {nomes} ) {
  return (
    <div className='nomes-container'>
        {
            nomes.map(nome => <p key={nome}>{nome}</p>)
        }
    </div>
  )
}