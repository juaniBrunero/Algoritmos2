var l;

function setup() {
  createCanvas(400, 400);
  l = new listaPol();

  rectMode(CENTER);
}

function draw(){
  background(0);
  l.mostrar(50, 50, 50);
}

function mousePressed(){
  l = agl(floor(random(10)), l);
  console.log(l);
}
