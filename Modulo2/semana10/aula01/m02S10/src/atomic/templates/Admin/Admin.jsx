import { Search } from '../../organisms'

export const Admin = ({ children, title }) => {
  return (
    <>
      <h1>{title}</h1>

      <Search />

      {children}
    </>
  )
}
