import axios from 'axios';
import React, { useEffect, useState } from 'react'

function GetDataOnline() {
    const [searchData,setsearchData]=useState({srch:""})
    useEffect(()=>{
        axios.get(`http://localhost:3000/articles/${searchData.srch}`)
        .then(res=>{
            searchData(res.data)
        })
        .catch(err=>{
            console.log(err)
        })
    },[]);
  return (
    <>
        <input type="search"
                value={searchData.srch}
                onChange={e=>setsearchData({srch:e.target.value})}
         />
        

    </>
  )
}

export default GetDataOnline