/*Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */

public class Rectangle {
        Integer width;
        Integer length;
        Rectangle (Integer width,Integer length){
            this.length = length;
            this.width = width;

        }

        public  void  ObjectInfo(){
            System.out.println("Width: "+ width);
            System.out.println("Height: "+ length);
        }

        public  Integer Area(){

          Integer area = width * length;
          return  area;
        }

        public Integer Perimeter(){
            Integer perimiter = 2*(width + length);
                    return perimiter;
        }
}
