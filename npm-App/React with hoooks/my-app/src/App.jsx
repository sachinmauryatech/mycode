import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HookOne from './hookOne/HookOne'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <HookOne/>
    </>
  )
}

export default App
