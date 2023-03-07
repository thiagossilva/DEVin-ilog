//import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
//import './index.css'

const elementoRaiz = document.getElementById('root');
const reactRoot = ReactDOM.createRoot(elementoRaiz);

reactRoot.render(
  <div style={{backgroundColor: "blue", color:"white"}}>
    <App/>
    <p>TESTETESTE</p>
  </div>
)

