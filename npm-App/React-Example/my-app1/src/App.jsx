import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from './component/Header.jsx'
import View from './component/View.jsx'
import { Route, Routes } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css"

import "bootstrap/dist/js/bootstrap.bundle.min.js"


function App() {
  return (
    <>
      <Routes>
        <Route path='/' element={<Header/>}></Route>
        <Route path='/view' element={<View/>}></Route>
      </Routes>
    </>
  )
}

export default App
