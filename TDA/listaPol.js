/*
  Objeto de listaPol hace de lista parametrica para distintos tipos de datos por polimorfismo
  funciones propias de las listas(simplemente encadenadas)
  y una extra para mostrar en javascript usando p5.js
*/

function listaPol(){
  this.sig  = null;
  this.dato = null;
};

//Proyectores

listaPol.prototype.esVacia = function () { // DEVUELVE BOOL SI ES VACIA
  return this.sig == null;
};

function agl(x, xs) { // AGREGA ADELANTE UN ELEMENTO
  var lis = new listaPol();
  lis.sig = xs;
  lis.dato = x; //USA POLIMORFISMO PARA EL DATO
  return lis;
};

//Operaciones elementales

listaPol.prototype.cabeza = function () { // DEVUELVE CABEZA DE LA LISTA
  return this.dato;
};

listaPol.prototype.resto = function (l){ // DEVUELVE EL RESTO DE LA LISTA PARAMETRO
  return l.sig;
};

listaPol.prototype.elCab = function (){ // ELMINA LA CABEZA DE LA LISTA
  return this.sig;
};

listaPol.prototype.copiar = function (){ // COPIA ESTA LISTA EN OTRA
  if(this.sig == null){
    return new listaPol();
  }else{
    return agl(this.dato, this.resto(this).copiar());
  }
}

//Operaciones complejas

listaPol.prototype.longitud = function () { // DEVUELVE LONG DE LA LISTA (iteracion)
  if(this.dato == null){
    return 0;
  }else{
    return (this.sig.longitud() + 1);
  }
};

listaPol.prototype.concatenar = function(g){ // CONCATENA ESTA + OTRA
  if(g.sig == null){
    return this;
  }else{
    if(this.sig == null){
      return g;
    }else{
      return agl(this.dato, this.sig.concatenar(g))
    }
  }
};

function aConTodos (a, xs){
  if(xs.sig != null){
    xs.dato = xs.dato * a;
    aConTodos(a, xs.resto(xs));
  }
};

//Operaciones para mostrar

listaPol.prototype.mostrar = function (x, y, r, t) { // MUESRTA CON 3 PARAMETROS
  if(this.sig != null){
    stroke(255);
    strokeWeight(1);
    noFill();
    rect(x, y, r, r);
    textSize(r/2);
    text(this.dato, x - (r/8), y + (r/8));
    if(y+3/2 * r > height){
      x += t + r+10;
      y = t;
    }
    this.sig.mostrar(x, y + r, r, t);
  }
};
