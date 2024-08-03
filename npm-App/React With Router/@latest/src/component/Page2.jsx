import React from 'react'
import { Outlet } from 'react-router-dom'

function Page2() {
  return (
    <>
    <div><h1>Page2</h1></div>
    <Outlet/>
    </>
  )
}

export default Page2