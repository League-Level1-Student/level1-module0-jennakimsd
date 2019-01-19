import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int x=10; 
int y=10;
int speed=5; 
void setup(){
  size(600, 600);
  background(#001BFF);
  minim = new Minim (this);
  //sound = minim.loadSample("pong.wav", 128);
  //backgroundImage = loadImage("image.jpg");
}

void draw(){
 //image(backgroundImage, 0, 0);
//image(backgroundImage, 0, 0, width, height);
 background(#001BFF);
 fill(#00ACFF);
 stroke(#000000);
 x+= speed;
 ellipse(x, y, 20,20);
 
 //sound.trigger();
 //rect(mouseX, 500, 50, 60);
}

//boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
    // if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
         // return true;
     //else 
          //return false;
//}