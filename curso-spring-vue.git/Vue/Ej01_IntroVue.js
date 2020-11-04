Vue.component("app-saludo", {
    "template": `<h2>Hola soy un componente</h2> `

});
Vue.component("app-adios", {
    "template": `
    <h4>Hasta luego</h4>
     `
});
Vue.component("app-despedida", {
    "template": `
    <div><h2> A la voluntad de Dios </h2>
    <h2>Pues hasta luego!!!!!!!</h2>
    </div>`

});
new Vue({
    "el": "#app-section",
    template: `
    <div><h2> Hola ICA</h2>
    <app-saludo></app-saludo></div>`
});
new Vue({
    "el": "#app-section-2",
});
new Vue({
    "el": "#app-section-3",
    template: `
    <div><h4> Con dios</h4>
    <app-saludo></app-saludo>
    <app-adios></app-adios> </div>
    `
});