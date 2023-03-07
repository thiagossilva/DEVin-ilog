
import './App.css'
import { Eventos } from './components/Eventos'
import { Estado } from './components/Estado'

function App() {

  return (
    <>
      <Estado titulo="Estado" valorInicial="teste inicio state" />
      <hr />
      <Eventos />

    </>
  )



}

export default App
