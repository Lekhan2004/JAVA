class Box{
	int length,breadth,height;
	Box(int l,int b,int h){//all variables
		length=l;
		breadth=b;
		height=h;
	}
	Box(){//No Parameters
		length=breadth=height=2;
	}
/*	Box(Boxweight b1){//Sending Object(Box)  itself as the parameter
		length=b1.l;
		breadth=b1.b;
		height=b1.h;
	}*/
	Box(int l)//only single parameter
	{
		length=breadth=height=l;
	}
	void Boxvol() {
		System.out.println("Volume is"+length*breadth*height);
	}
}
class Boxweight extends Box{
	int wei;
	Boxweight(int wei,int l,int b,int h){
		super(l,b,h);
		this.wei=wei;
	}
	Boxweight(int len){
		super(len);
		this.wei=wei;
	}
	void boxw() {
		System.out.println("Weight is "+wei);
	}
/*	Boxweight(Boxweight ob){
		super(ob);
		wei=ob.wei;
	}*/
	
}
class Shipment extends Boxweight{
	int noofbox,costpb;
	Shipment(int N,int c,int l,int b,int h,int w){
		super(w,l, b, h);
		costpb=c;
		noofbox=N;
	}
	void ShipmentDetails() {
		System.out.println("The total no of boxes in the shipment is:"+noofbox);
		System.out.println("Cost of one box in the shipment is:"+costpb);
		System.out.println("Total cost of shipment is:"+costpb*noofbox);
	}
}
public class ConsOver {
	public static void main(String[] args) {
	//	Box b=new Box()
		Boxweight bw=new Boxweight(10,1,2,3);
		System.out.println("Box volume through Boxweight Object");
		bw.Boxvol();
		Shipment s=new Shipment(20,100,1,2,3,10);
		System.out.println("Shipment Details through Shipment object");
		s.ShipmentDetails();
		System.out.println("Box volume through Shipment Object");
		s.Boxvol();
	}
}
