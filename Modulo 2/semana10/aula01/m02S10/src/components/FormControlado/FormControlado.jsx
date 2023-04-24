import { useState } from 'react'

function FormControlado () {
  const [formValues, setFormValues] = useState({
    login: '',
    senha: '',
    nome: ''
  })

  const handleSubmit = (event) => {
    event.preventDefault()

    alert(JSON.stringify(formValues))
  }

  const handleChange = (event) => {
    // const name = event.target.name;
    // const value = event.target.value;

    // setFormValues((prev) => {
    //   return {
    //     ...prev,
    //     [name]: value,
    //   };
    // });

    const { name, value } = event.target

    setFormValues((sapato) => ({
      ...sapato,
      [name]: value
    }))
  }

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="nome">Nome</label>
        <input
          id="nome"
          name="nome"
          type="text"
          placeholder="Nome"
          value={formValues.nome}
          onChange={handleChange}
        />
      </div>

      <div>
        <label htmlFor="login">Login</label>
        <input
          id="login"
          name="login"
          type="text"
          placeholder="Login"
          value={formValues.login}
          onChange={handleChange}
        />
      </div>

      <div>
        <label htmlFor="senha">Senha</label>
        <input
          id="senha"
          name="senha"
          type="password"
          placeholder="Senha"
          value={formValues.senha}
          onChange={handleChange}
        />
      </div>

      <button type="submit">Enviar</button>
    </form>
  )
}

export default FormControlado
