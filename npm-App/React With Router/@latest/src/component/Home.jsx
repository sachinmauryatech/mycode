import React from 'react'
import {  NavLink } from 'react-router-dom'

function Home() {
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
      const list=links.map(link=>(<li><NavLink className='nav-link active ' to={link.navlinks}>{link.navtitle}</NavLink></li>))
  return (
    <>
    <div className='navbar navbar-expand-lg bg-body-tertiary'>
        <div className='container'>
       <ul className='d-flex justify-content-around'>
        {list}
       </ul>
        </div>
    </div>
    </>
  )
}

export default Home