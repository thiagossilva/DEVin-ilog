import * as yup from 'yup'

export const formHookSchema = yup.object().shape({
  nome: yup
    .string()
    .required('Nome obrigatório')
    .min(3, 'Mínimo 3 caracteres')
    .oneOf(['teste', 'novo']),
  email: yup.string().required('E-mail obrigatório').email('E-mail inválido')
})
