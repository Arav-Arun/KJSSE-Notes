// Marker Interface (no methods)
interface Printable {
}

// Class implementing the marker interface
class Document implements Printable {
    // Class implementation
    public void print() {
        System.out.println("Printing the document");
    }
}

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        // Checking if the object is an instance of the marker interface
        if (document instanceof Printable) {
            document.print();
        } else {
            System.out.println("Cannot print this document");
        }
    }
}
