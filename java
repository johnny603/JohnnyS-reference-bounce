var x = 0;
var y = 0;
var speedX = 20;
var speedY = 20;
var value = 0;

function setup() {
  createCanvas(600, 400);
}

function draw() {
  background(y, value, x, -y);

  fill(255, 0, 0);
  rect(mouseX, mouseY, 50, 50);

  if (x > mouseY) {
    speedX = random(-20);
    
  } else if (x < width) {
    speedX = random(20);
    
  }

  if (y > mouseX) {
    speedY = random(-20);
    
    
  } else if (y < height) {
    speedY = random(20);
    
  }
  fill(y, mouseY, mouseX);
  ellipse(x, y, 150, 150);

  fill(x, mouseX, mouseY);
  ellipse(y, x, 100, 100);

  strokeWeight(random(10));
  fill(x, y, mouseX);
  triangle(y, x, y, x, x, y);
  x = x + speedX;
  y = y + speedY;

  value = value + 1;
}
