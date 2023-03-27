import { Button } from '../../atoms'
import { InputGroup } from '../../molecules'

export const Search = ({ onSearch }) => {
  return (
    <>
      <InputGroup
        label="Buscar"
        inputProps={{ placeholder: 'Digite um termo para buscar' }}
      />
      <Button onClick={onSearch}>Buscar</Button>
    </>
  )
}
