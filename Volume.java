import java.util.*;
class Box{
	int w,h,d;
	Box (int w,int h,int d){
	this.w=w;
        this.h=h;
	this.d=d;
	}
	int vol(){
	int v;
	v=w*h*d;
	return v;
	}
}
class Volume{
	public static void main(String[] arg){
		Box b1=new Box(1,2,3);
		int x=b1.vol();
		System.out.println("Volume is"+x); 
		}
}
