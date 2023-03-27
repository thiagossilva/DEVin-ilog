import { useForm } from 'react-hook-form'
import { yupResolver } from '@hookform/resolvers/yup'

import { formHookSchema } from './formHookSchema'

function FormHook () {
  const {
    register,
    handleSubmit,
    formState: { errors },
    reset
  } = useForm({
    defaultValues: {
      nome: 'Teste',
      email: 'teste@gmail.com'
    },
    mode: 'all',
    resolver: yupResolver(formHookSchema)
  })

  const onSubmit = (data) => {
    console.log(data)
    reset()
  }

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <div>
        <label htmlFor="nome">Nome</label>
        <input id="nome" type="text" placeholder="Nome" {...register('nome')} />
        {errors.nome && <span>{errors.nome.message}</span>}
      </div>
      <div>
        <label htmlFor="email">E-mail</label>
        <input
          id="email"
          type="text"
          placeholder="E-mail"
          {...register('email')}
        />
        {errors.email && <span>{errors.email.message}</span>}
      </div>

      <button type="button" onClick={() => reset()}>
        Limpar
      </button>
      <button type="submit">Enviar</button>
    </form>
  )
}

export default FormHook
