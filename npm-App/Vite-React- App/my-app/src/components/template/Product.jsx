import React from 'react'
import "bootstrap/dist/css/bootstrap.min.css"

import "bootstrap/dist/js/bootstrap.bundle.min.js"

const Product = () => {
    return (
        <div className='container'>
            <div className='row my-3 px-2' style={{ height: "19vh" }}>
                <div className='col-3 border border-primary'><h2>Training</h2></div>
                <div className='col-3 border border-secondary'><h2>Training</h2></div>
                <div className='col-3 border border-primary'><h2>Training</h2></div>
                <div className='col-3 border border-secondary'><h2>Training</h2></div>
            </div>
        </div>
    )
}

export default Product