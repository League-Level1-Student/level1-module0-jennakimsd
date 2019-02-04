import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int X=0; 
int Y=0;
int speedX=10; 
int speedY=5;
void setup(){
  size(600, 600);
  minim = new Minim (this);
  sound = minim.loadSample("ping-pong.wav", 128);
  backgroundImage = loadImage("background.jpg");
}

void draw(){
  image(backgroundImage,0 ,0);
 image(backgroundImage, 0, 0, 600, 600);
 fill(#00ACFF);
 stroke(#000000);
 X += speedX;
 Y += speedY;
 ellipse(X, Y, 20,20);
 fill(#FFFFFF);
 rect(mouseX, 498, 80, 100);
 if (X>=width){
   speedX=speedX*-1;
 }  
 else if (X<0){
   speedX=speedX*-1;
 }
 
 if (Y>=height){
   sound.trigger();
   speedY=speedY*-1;
 } 
 if (Y<0){
   speedY=speedY*-1;
 }
 
  if(intersects(X, Y, mouseX, 498, 80, 100)){
    speedY=speedY*-1;
  }


}


  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleWidth, int paddleLength) {
    
    if (ballX > paddleX && ballX < paddleX + paddleWidth && ballY > paddleY && ballY < paddleY + paddleLength){
          return true;}
          
     else {
          return false;}
}