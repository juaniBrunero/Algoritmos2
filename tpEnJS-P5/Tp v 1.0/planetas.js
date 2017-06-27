function Planeta(dis, vel){
  this.dis = dis;
  this.vel = vel;

  this.mostrar = function(a){
    stroke(255, 0, 0);
    strokeWeight(8);
    point(this.dis / 10 * cos(radians(a*this.vel)), this.dis / 10 * sin(radians(a*this.vel)));
    console.log(floor(this.dis * cos(radians(a*this.vel))) + "  " + floor(this.dis * sin(radians(a*this.vel))));
  }

  this.orbita = function(){
    stroke(255);
    strokeWeight(1);
    noFill();
    ellipse(0, 0, this.dis/5, this.dis/5);
  }

  this.unir = function(a, p){
    stroke(255);
    strokeWeight(2);
    line(this.dis / 10 * cos(radians(a*this.vel)), this.dis / 10 * sin(radians(a*this.vel)), p.dis / 10 * cos(radians(a*p.vel)), p.dis / 10 * sin(radians(a*p.vel)))
  }
}
