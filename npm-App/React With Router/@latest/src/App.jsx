import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import "bootstrap/dist/css/bootstrap.min.css"

import "bootstrap/dist/js/bootstrap.bundle.min.js"
import { Route, Routes } from 'react-router-dom'
import Home from './component/Home'
import Page1 from './component/Page1'
import Page2 from './component/Page2'
import Page3 from './component/Page3'
import Page4 from './component/Page4'

function App() {
  const links=[
    {
      id:1,
      navlinks:"/",
      navtitle:"Home"
    },
    {
      id:2,
      navlinks:"/page1",
      navtitle:"Page1"
    },
    {
      id:3,
      navlinks:"/page2",
      navtitle:"Page 2"
    },
    {
      id:4,
      navlinks:"/page3",
      navtitle:"Page 3"
    },
    {
      id:5,
      navlinks:"/page4",
      navtitle:"Page 4"
    }
  ]
  const list=links.map(link=>(<Route path={link.navlinks} element={<h1>{link.navtitle}</h1>}>{link.navtitle}</Route>))
  return (
    <>
    <Home/>
      <Routes>
        {list}
      </Routes>
    </>
  )
}

export default App
