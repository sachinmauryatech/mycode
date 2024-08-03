// import redux from 'redux';
// step 1
const redux = require('redux')
const createStore = redux.createStore;

// step 2
const BUY_CAKE = 'BUY_CAKE';
const BUY_COOKIES = 'BUY_COOKIES';


// step 3
function buyCake() {
    return {
        type: BUY_CAKE,
        info: "This is action"
    }
}
function buyCookies() {
    return {
        type: BUY_COOKIES,
        info: "This is action"
    }
}


// step 4

const initialState = {
    numOfCake: 10,
    numofCookies:12,
}

// step 5

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case BUY_CAKE: return {
            ...state,
            numOfCake: state.numOfCake - 1
        }
        case BUY_COOKIES: return {
            ...state,
            numofCookies: state.numofCookies - 1
        }

        default: return state
    }
}
// step 6
const store = createStore(reducer);
console.log("Stock Of cake", store.getState());
store.subscribe(() => console.log("Updated cake Count", store.getState()));
store.dispatch(buyCake());
store.dispatch(buyCake());
store.dispatch(buyCake());
store.dispatch(buyCake());
store.dispatch(buyCookies());
store.dispatch(buyCookies());
store.dispatch(buyCookies());
store.dispatch(buyCookies());

