function listaPol(){
  this.sig  = null;
  this.dato = null;
};

//Proyectores

listaPol.prototype.esVacia = function () {
  return this.sig == null;
};

function agl(x, xs) {
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

listaPol.prototype.copiar = function (){
  if(this.sig == null){
    return new listaPol();
  }else{
    return agl(this.dato, this.resto(this).copiar());
  }
}

//Operaciones complejas

listaPol.prototype.longitud = function () { // DEVUELVE LONG DE LA LISTA (iteracion)
  var l = this;
  var i = 0;
  while(l.sig != null){
    l = l.sig;
    i++;
  }
  return i;
};

//Operaciones para mostrar

listaPol.prototype.mostrar = function (x, y, r) {
  if(this.sig != null){
    stroke(255);
    strokeWeight(1);
    noFill();
    rect(x, y, r, r);
    textSize(r/2);
    text(this.dato, x - (r/8), y + (r/8));
    if(y+3/2 * r > height){
      x += r;
      y = 0;
    }
    this.sig.mostrar(x, y + r, r);
  }
};
