import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import GetDataOnline from './components/GetDataOnline'
import UserInsert from './components/UserInsert'
import Insert from './components/Insert'
import { Routes } from 'react-router-dom'
import View from './components/View'

function App() {

  return (
    <>
      {/* <GetDataOnline/> */}
      {/* <UserInsert/> */}
      <View/>
      {/* <Insert/> */}
    </>
  )
}

export default App
