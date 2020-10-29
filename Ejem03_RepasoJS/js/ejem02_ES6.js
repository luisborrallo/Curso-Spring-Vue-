const PI = 3.1415926;
/*
let unaVar = 20;
let unTexto = "QUe pasa!";

document.write(`<br>
texto en varias
lineas, y ademas podemos mostrar <br>
variables asi : ${UnaVar} y otro texto: ${unTexto}`);
document.write("<br>");
*/
// funciones lambda 
var suma = (x, y) => x + y;

document.write("<br>" + suma(3 + 2));

class Dato {
    constructor(x, y = 20) {
        this.x = x;
        this.y = y;
    }
    mostrar() {
        document.write(`<br> Dato: x  = ${this.x} y =${this.y}`);
    }
}


class Info extends Dato {
    constructor(x, y = 20, z = 20) {
        super(x, y);
        this.z = z;
    }
    mostrar() {
        super.mostrar();
        document.write(`z =${this.z}`);
    }
}
let dato = new Dato("lo q tu quieras");
dato.mostrar();
let info = new Info("Otra info");
info.mostrar();