import React,{useState} from 'react'

function Calc() {
  const[num1,setNum1]=useState('');
  const[num2,setNum2]=useState('');
  const[res,setRes]=useState('No result');
  const handelNum1=
    (e) => {setNum1(Number(e.target.value))
  }
  const handelNum2=
    (e) => {setNum2(Number(e.target.value))
  }
  const addition=()=>{
    const  add=num1+num2
    setRes(add)
  }
  const sub=()=>{
    const  subt=num1-num2
    setRes(subt)
  }
  const multiply=()=>{
    const  mult=num1*num2
    setRes(mult)
  }
  const divi=()=>{
    const  div=num1/num2
    setRes(div)
  }
  return (
    <>
    <div className='body'>
        <label >Enter Two numbers:</label>
        <input type='number'
               value={num1}
            onChange={handelNum1}

        ></input>
        <input type='number'
              value={num2}
              onChange={handelNum2}
        >
        </input>
        <button onClick={addition}>+</button>
        <button onClick={sub}>-</button>
        <button onClick={multiply}>*</button>
        <button onClick={divi}>/</button>
        <h1>Result:{res}</h1>
      </div>
    </>
  )
}

export default Calc