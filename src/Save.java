
public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20,b=10;
a +=b;
System.out.println(a);
a-=b;
System.out.println(a);
a*=b;
System.out.println(a);
a/=b;
System.out.println(a);
a%=b;
System.out.println(a);
int count=5;
System.out.println("first count"+count);
System.out.println(count++);
System.out.println("value added" +count);
System.out.println(--count);
System.out.println(count--);
System.out.println(count);
System.out.println(++count);
System.out.println(count++);
System.out.println(count);
String n=(count <=6)?"true":"false";
System.out.println("torf"+n);
int k=(count%6);
if (k==1) {
	System.out.println("ur correct");

}
else if (k!=1) {
	System.out.println("no re bhai");
}
	}

}
