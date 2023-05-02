export default function ListaPessoas( { pessoas } ) {
  return (
    <div>
        <h1>Lista de Pessoas Cadastradas</h1>
        <div>
            {
                pessoas.map(pessoa => <p key={pessoa.nome}>{pessoa.nome} - {pessoa.idade}</p>)
            }
        </div>
    </div>
  )
}