import React from 'react'
import { Link, Outlet } from 'react-router-dom'

function Page1() {
  return (
    <>
    <div><h1>Page1</h1></div>
    <Link to="/" >Apple</Link>
    <Outlet/>
    </>
  )
}
export default Page1