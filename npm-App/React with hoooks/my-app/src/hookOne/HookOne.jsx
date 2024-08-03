
import axios from 'axios';
import React, { useEffect, useState } from 'react'

function HookOne() {
    const[album,setAlbum]=useState([]);
    useEffect( ()=>{
        axios.get("https://jsonplaceholder.typicode.com/photos")
        .then(res=>{
            setAlbum(res.data)
        })
        .catch(err=>{
            console.log(err)
        })
    },[]
    );

  return (
    <>
        <div>
            {album.map(album=> <div className='album' key={album.id}>
                <h1>{album.id}😎{album.title}</h1>
                <img src={album.url}/>
                <img src={album.thumbnailUrl}/>
            </div>)}
        </div>
    </>
  )
}

export default HookOne