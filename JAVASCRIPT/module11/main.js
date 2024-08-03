class Head extends HTMLElement{
    constructor(){
        super();
        this.innerHTML='<div class="head"><img src="src/Aerofy-150-×-50-px-e1689748477279.png" alt="logo"><ul><li><a href="">home</a></li><li><a href="">About us</a></li><li><a href="">technology</a></li><li><a href="">contact us</a></li></ul><h3><a href="">speak with an expert</a></h3></div><hr></hr>'
    }
}
window.customElements.define('window-head',Head);