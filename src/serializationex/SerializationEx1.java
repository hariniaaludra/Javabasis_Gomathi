package serializationex;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int id;
	 public Student(String name, int id) {
		this.name=name;
		this.id = id;		
	}
}
public class SerializationEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Student details = new Student("Abi", 101);
		
		FileOutputStream foutput = new FileOutputStream("Strudent File");
		ObjectOutputStream output = new ObjectOutputStream(foutput);
		
			output.writeObject(details);
			System.out.println(details.id +" "+ details.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Student details = new Student("Abi", 101);
			
			FileInputStream finput = new FileInputStream("Strudent File");
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Strudent File"));
			
				Student detailsin =(Student)input.readObject();
				System.out.println(details.id +" "+ details.name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
