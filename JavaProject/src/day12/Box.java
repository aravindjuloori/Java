package day12;

public class Box {
	
	double width,height,deepth;
	
	
	Box(){    //1
		width=0;
		height=0;
		deepth=0;
		
	}
	
	Box(double w,double h,double d){
		width=w;
		height=h;
		deepth=d;
	}
	
	Box(double len){
		width=height=deepth=len;
	}
	
	public double volume() {
		return width*height*deepth;
		
	}
	
}
