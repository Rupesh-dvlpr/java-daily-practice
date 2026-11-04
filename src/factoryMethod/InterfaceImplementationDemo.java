package factoryMethod;

interface Printer{
	public abstract void print();
}

class Print implements Printer{
	@Override
	public void print() {
		IO.println("Printing...");
	}
}

class PrinterDemo{
	public static Printer getPrinter() {
		return new Print();
	}
}
public class InterfaceImplementationDemo {

	public static void main(String[] args) {
		IO.println("===============Factory Method with interface method return type===========");
		
		Printer printer = PrinterDemo.getPrinter();
		printer.print();
	}

}
