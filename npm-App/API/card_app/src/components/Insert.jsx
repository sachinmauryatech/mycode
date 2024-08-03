import axios from 'axios'
import React, { useState } from 'react'

function Insert() {
    // step 1
    const [post, setPost] = useState({ id: "", title: "", msg: "" })

    // step 2
    const submitHandler = () => {
        axios.post("http://localhost:5000/articles/", post)
    }
    return (
        <div style={{ textAlign: "center" }}>
            <h1>Insert The Article</h1>
            <form onSubmit={submitHandler}>
                <input
                    style={{ padding: "1%", marginBottom: "1vh", width: "50%" }}
                    type='text'
                    placeholder='Enter The Post Titile'
                    onChange={e => setPost({ ...post, title: e.target.value })}
                />
                <br />
                <textarea
                    style={{ padding: "1%" }}
                    cols={100}
                    rows={10}
                    placeholder='Enter The Post Information'
                    onChange={e => setPost({ ...post, msg: e.target.value })}

                    value={post.msg}
                >

                </textarea>
                <br />

                <button style={{ padding: "1% 2%" }} >Insert Data</button>
            </form>





        </div>
    )
}

export default Insert