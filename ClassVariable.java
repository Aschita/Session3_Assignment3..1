package Assignment3a;

public class ClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Item prod1 = new Item();
	     prod1.setBarcode(123456);
	     Item prod2 = new Item();
	     prod2.setBarcode(987654);

	        System.out.println(prod1.getBarcode());
	        System.out.println(prod2.getBarcode());
	}

}
class Item {

    public static int Barcode;

    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int value){
        Barcode = value;
    }
}
