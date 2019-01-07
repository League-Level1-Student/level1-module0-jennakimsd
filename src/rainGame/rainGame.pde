int raindropY=10;
//int randomNumber = random(600);
void setup(){
  size(600, 600);
  background(#001BFF);
}

void draw(){
  background(#001BFF);
  fill(#00ACFF);
  stroke(#000000);
  raindropY++;
  ellipse(300, raindropY, 10, 20);
  fill(#959595);
  stroke(#000000);
  rect(250, 500, 100, 120);
  if(raindropY==500){
   //step 5
  }
}