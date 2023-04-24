import { Label, Input } from '../../atoms'

export const InputGroup = ({ label, inputProps }) => {
  return (
    <>
      <Label text={label} />

      <Input {...inputProps} />
    </>
  )
}
