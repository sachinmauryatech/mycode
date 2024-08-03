class Ducat extends HTMLElement{
    constructor(){
        super();
        if(this.getAttribute('data')){
            this.innerHTML=this.getAttribute('data');
        }
        else{
            this.innerHTML="Hello In Ducat India";
        }
    }
}
window.customElements.define('sachin-india',Ducat);