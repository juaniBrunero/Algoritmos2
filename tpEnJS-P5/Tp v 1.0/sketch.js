
function setup() {
  createCanvas(600, 600);

}

function draw(){
  background(0);
  translate(width/2, height/2);
  stroke(255);
  strokeWeight(4);
  point(0, 0);
}

function Planeta(dis, vel){
    this.dis;
    this.vel;

    this.Planeta = function(){
      this.dis = dis;
      this.vel = vel;
    }
}
