package dk.easv;

public class Main {

    public static void main(String[] args) {
	    Employee emp = new Employee();
	    emp.setName("Thomas Boulund Meng Hansen");
	    emp.setBirthday(new Birthday(10, 8, 1987));
        System.out.println(emp.getAge());
    }
}

