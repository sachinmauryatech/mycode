import axios from 'axios';
import React, { useState } from 'react'
import { Link } from 'react-router-dom';
function UserInsert() {
    const [users, setUsers] = useState({ id: "", title: "", msg: "" })

    const insertData = (e) => {
        e.preventDefault()
        axios.post("http://localhost:3000/articles", users)
        console.log("insert data");
    }



    return (
        <div className='form'>
            <h1>User Insert Data</h1>
            <Link to="/">Back</Link>
            <input
                type="text"
                className='txt'
                placeholder='Enter Your First Name'
                onChange={e => setUsers({ ...users, id: e.target.value })}
            />
            <input
                type="text"
                className='txt'
                placeholder='Enter Your Last Name'
                onChange={e => setUsers({ ...users, title: e.target.value })}
            />
            <input
                type="text"
                className='txt'
                placeholder='Enter Your Email'
                onChange={e => setUsers({ ...users, msg: e.target.value })}
            />
            <button onClick={insertData}>Insert Data</button>

                <h2>{JSON.stringify(users)}</h2>





        </div>
    )
}

export default UserInsert