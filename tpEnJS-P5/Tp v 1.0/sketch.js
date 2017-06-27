var planetas = [];
var c = 0;
var antc = 1;
function setup() {
  createCanvas(600, 600);
  var Ald = new Planeta(500 , 1);
  var Fel = new Planeta(2000, 3);
  var Per = new Planeta(1000, -5);

  planetas.push(Ald);
  planetas.push(Fel);
  planetas.push(Per);

  frameRate(30);
}

function draw(){
  if(c != antc){
    antc = c;
    background(0);
    translate(width/2, height/2);
    stroke(255);
    strokeWeight(6);
    point(0, 0);

    for (var i = 0; i < planetas.length; i++) {
      planetas[i].orbita();
      planetas[i].mostrar(c);
    }

    for (var i = 0; i < planetas.length-1; i++) {
      for (var j = i+1; j < planetas.length; j++) {
        planetas[i].unir(c, planetas[j]);
      }
    }
  }
}
