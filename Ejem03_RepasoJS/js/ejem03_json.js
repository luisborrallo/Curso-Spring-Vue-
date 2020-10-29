//json
//Otra forma de crear objetos con la anotacion JSON

let objetoVacio = {}; //new  Objecto es lo mismo

let formaPago = {
    "modo": "Tarjeta credito",
    "comision": 2,
    "activa": true,
    "preparacion": null,
    "clientes": ["SANTANDER", "SABADELL", "BBVA", [1, 23, 55]],
    "configuracion": {
        "conexion": "ssl",
        "latencia": 15
    }
};
let arrayVacio = [];
let datos = ["Churros", "Merinas", 200, true, null, { "ale": "mas datos" }];
let matriz = [
    [4, 6, 8],
    [3, 7, 7],
    [1, 5, 7]
];
formaPago.servidor = "http://visa.com";
formaPago["oculta"] = "dame 5 centimos pa mi";
document.write(`<br>
<p> ${formaPago.modo} - ${formaPago.clientes[1]} - ${formaPago.clientes[3][2]} </p>
${matriz [2][1]}
<h2>${JSON.stringify(formaPago)}</h2>
Usando forma Hasmap: ${formaPago["servidor"]}
`);
let petUsu = prompt("¿Que dato quieres?");
document.write(` <br> ${formaPago[petUsu]}`);
let frutas = `[
    {"nombre": "pera", "precio: " "20"},
    {"nombre": "kiwi", "precio: " "27"},
    {"nombre": "fresa", "precio: " "37"},]`;
let objFrutas = JSON.parse(frutas);
document.write(`<br> ${objFrutas[1].nombre} - ${objFrutas[2]["precio"]}`);