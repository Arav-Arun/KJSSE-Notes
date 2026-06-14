public class Company {
    private Department departments[];
	private int numberOfDepartments;
    public Car(int d) {
		numberOfDepartments = d;
        this.departments = new Department[numberOfDepartments];
    }

    public Department[] getDeptInfo() {
        return this.departments;
    }
}

public class Department {
    // ...
}
