import ddf.minim.*;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;
int angle= 0;
void setup(){
  size(600,600);    
  pictureOfRecord= loadImage("record.jpg");  
  pictureOfRecord.resize(610,610);
  minim = new Minim(this);
  song = minim.loadFile("cheerful-song.wav");
}

void draw(){
  angle=angle+100;
  if(mousePressed){
    rotateImage(pictureOfRecord, angle);
    song.play();
  }
  else{
    song.pause();
  }  
  image(pictureOfRecord, 5, 5);   
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}