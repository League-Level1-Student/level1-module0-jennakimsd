int raindropY=10;
int raindropX=300;
int score= 0;
void setup(){
  size(600, 600);
  background(#001BFF);
}

void draw(){
  background(#001BFF);
  fill(#00ACFF);
  stroke(#000000);
  raindropY+=10;
  ellipse(raindropX, raindropY, 10, 20);
  fill(#959595);
  stroke(#000000);
  rect(mouseX, 500, 100, 120);
  int randomNumber = (int) random(600);
  if(raindropY>=(600-120)){
    checkCatch(raindropX);
    raindropX=randomNumber;
    raindropY=10;
  }
  fill(0,0,0);
  textSize(16);
  text("Score: " + score,20,200);
}

  void checkCatch(int x){
     if (x > mouseX && x < mouseX+100){
          score++;}
     else {
          score--;
          println("Your score is now: " + score); }
  }