const PI = 3.1415926;

let unaVar = 20;
let text = "HOla";

document.write(`<br> Texto en varias <br> lineas y además mostramos variables asi: <br>${unaVar} ${text}`);

var suma = (x, y) => x + y;

suma(5, 7);
var elevarPotencias = (x, y) => x ** y;
var cuadrado = x => x ** 2;

//Funcion flecha division
var division = (x, y) => x / y;

//Funcion flecha resto
var resto = (x, y) => x % y;

document.write("<br>" + suma(5, 7) + "<br>");
document.write(cuadrado(7, 8));



class Dato {
    constructor(x, y) {
        this.x = x;
        this.y = y;

    }
    mostrar() {
        document.write(`X: ${this.x} Y: ${this.y} `);
    }
}

class Info extends Dato {
    constructor(x = 10, y = 20, z = 401) {
        super(x, y);
        this.z = z;

    }

    mostrar() {
        super.mostrar();
        document.write(`Z: ${this.z} `);
    }
}

info = new Info();
info.mostrar();