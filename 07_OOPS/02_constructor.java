/** CONSTRUCTOR */
/** A constructor in Java is a special block of code used to initialize newly created objects.
 * It is automatically called when an instance of a class is created using the new keyword */

class ConstructorInJava{
  public static void main(String[] args) {
    // initializing default constructor
    Employee emp1 = new Employee();
    emp1.employeeInfo();

    //initializing parametrized constructor
    Employee emp2 = new Employee("367", "suraj");
    emp2.employeeInfo();

    //initializing this parametrized constructor
    Employee emp3 = new Employee("SDE1", 500000);
    emp3.otherDetails();
  }
}

class Employee{
  String empId;
  String name;
  String designation;
  int salary;

  // Default constructor
  Employee(){

  }

  //Parameterized constructor
  Employee(String id, String empName){
    empId  = id;
    name = empName;
  }

  //this keyword to define instance variable
  Employee(String designation, int empSalary){
    this.designation = designation;  //used when both keys are same
    salary = empSalary;
  }

  void employeeInfo(){
    System.out.println("Id: "+empId+" EmployeeName: "+name);
  }

  void otherDetails(){
    System.out.println("Designation: "+designation+" Salary: "+salary);
  }
}