package day12;

public class Box {
	
	double width,height,deepth;
	
	
	Box(){    //1
		width=0;
		height=0;
		deepth=0;
		
	}
	
	Box(double w,double h,double d){  //2
		width=w;
		height=h;
		deepth=d;
	}
	
	Box(double len){   //3
		
		width=height=deepth=len;
	}
	
	double volume() {
		
		return (width*height*deepth);
	}

	
}
