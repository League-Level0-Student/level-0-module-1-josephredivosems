
void setup() {
size(500,700);
  PImage face = loadImage("zombie.png");
face.resize(500,700);
image(face, 0, 0);


}
void draw() {
   fill(#020203);
  ellipse(125,225, 50 , 50);
  ellipse(125,225,125,125);
  ellipse(350,225,125,125);
  if(mouseX > 100 && mouseX < 200){
  fill(#DB1DAF);
  
  if(mouseY > 200 && mouseY < 300){
  fill(#DB1D33);
    
  }
 if(mouseY > 0 && mouseY < 100){
  fill(#1D70DB);
 }
  

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   ellipse(125,225,125,125);
  ellipse(350,225,125,125);



   fill(#020203);
  ellipse(125,225, 50 , 50);
ellipse(350,225,50,50);

 



}}
