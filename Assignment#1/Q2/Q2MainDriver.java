// Abstract class Person
abstract class Person {
    private int Aadhar_id;
    private String Name;
    private int Phone;
    private String Profession;

    public Person(int aadhar_id, 
                    String name, 
                    int phone, 
                    String profession) {

        this.Aadhar_id = aadhar_id;
        this.Name = name;
        this.Phone = phone;
        this.Profession = profession; 
    }

    // Getter and Setter for Aadhar_id
    public int getAadhar_id() {
        return Aadhar_id;
    }

    public void setAadhar_id(int Aadhar_id) {
        this.Aadhar_id = Aadhar_id;
    }

    // Getter and Setter for Name
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    // Getter and Setter for Phone
    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    // Getter and Setter for Profession
    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public abstract String Register(String UID); // Abstract method to be implemented by subclasses
    public abstract String Perform(String duty);
    public abstract String include(String service);
    public abstract String like(String item);
    // public abstract void displayInfo();

    // public static void main(String[] args);
}

// Polymorphic class Student, inherited from Person
class Student extends Person {
    private String Student_Id = "";
    private String Major = "";
    private int Semester = 0;
    private String College = "";
    private int Grade = 0;

    // Constructor
    public Student(int aadhar_id, 
                    String name, 
                    int phone, 
                    String profession,

                    String student_Id, 
                    String major, 
                    int semester, 
                    String college, 
                    int grade) {
        
        super(aadhar_id, name, phone, profession);

        this.Student_Id = student_Id;
        this.Major = major;
        this.Semester = semester;
        this.College = college;
        this.Grade = grade;

        

        // this.setAadhar_id(aadhar_id);
        // this.setName(name);
        // this.setPhone(phone);
        // this.setProfession(profession);
        
    }

    // Getter and Setter for Student_Id
    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String Student_Id) {
        this.Student_Id = Student_Id;
    }

    // Getter and Setter for Major
    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    // Getter and Setter for Semester
    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    // Getter and Setter for College
    public String getCollege() {
        return College;
    }

    public void setCollege(String College) {
        this.College = College;
    }

    // Getter and Setter for grade
    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        this.Grade = grade;
    }

    //===================================

    public String Register2(String course) {
        return Student_Id + " has registered for the course: " + course;
    }

    // Get the grade for a course
    public int getGrade(String course) {
        if (course.equals(Major)) {
            return Grade;
        } else {
            System.out.println(Student_Id + " is not enrolled in the course: " + course);
            return -1; // Return -1 to indicate not enrolled
        }
    }

    // Attend a class
    public String Attend(String className) {
        return Student_Id + " attended the class: " + className;
    }

    // Learn
    public String Learn() {
            return Student_Id + " is learning " + Major;
    }



    @Override
    public String Register(String UID) {
        return "User with UID " + UID + " has been registered.";
    }

    @Override
    public String Perform(String duty) {
        return "Performing duty: " + duty;
    }

    @Override
    public String include(String service) {
        return "Including service: " + service;
    }

    @Override
    public String like(String item) {
        return "Liking item: " + item;
    }
}


// Polymorphic class Staff, inherited from Person
class Staff extends Person {
    private String Emp_id;
    private String Emp_Role;
    private String Emp_Dept;
    private Float Emp_Salary;
    private int Emp_Experience;

    public Staff(int aadhar_id, 
                    String name, 
                    int phone, 
                    String profession, 
                    
                    String Emp_id,
                    String Emp_Role,
                    String Emp_Dept,
                    Float Emp_Salary,
                    int Emp_Experience) {

        super(aadhar_id, name, phone, profession);
        this.Emp_id = Emp_id;
        this.Emp_Role = Emp_Role;
        this.Emp_Dept = Emp_Dept;
        this.Emp_Salary = Emp_Salary;
        this.Emp_Experience = Emp_Experience;
    }


    // Getter and setter for Emp_id
    public String getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(String Emp_id) {
        this.Emp_id = Emp_id;
    }

    // Getter and setter for Emp_Role
    public String getEmp_Role() {
        return Emp_Role;
    }

    public void setEmp_Role(String Emp_Role) {
        this.Emp_Role = Emp_Role;
    }

    // Getter and setter for Emp_Dept
    public String getEmp_Dept() {
        return Emp_Dept;
    }

    public void setEmp_Dept(String Emp_Dept) {
        this.Emp_Dept = Emp_Dept;
    }

    // Getter and setter for Emp_Salary
    public Float getEmp_Salary() {
        return Emp_Salary;
    }

    public void setEmp_Salary(Float Emp_Salary) {
        this.Emp_Salary = Emp_Salary;
    }

    // Getter and setter for Emp_Experience
    public int getEmp_Experience() {
        return Emp_Experience;
    }

    public void setEmp_Experience(int Emp_Experience) {
        this.Emp_Experience = Emp_Experience;
    }

    // ==============================================

    // Attend method
    public String Attend(String Duty) {
        return getName() + " is attending duty: " + Duty;
    }

    // getPromotion method
    public String getPromotion() {
        // Logic to determine promotion based on Emp_Experience, Emp_Salary, etc.
        // For demonstration purposes, let's assume a simple rule here
        if (Emp_Experience >= 5 && Emp_Salary >= 50000) {
            return "Congratulations, " + getName() + "! You are eligible for a promotion.";
        } else {
            return "Sorry, " + getName() + ". You are not eligible for a promotion yet.";
        }
    }
    

    @Override
    public String Register(String UID) {
        return "User with UID " + UID + " has been registered.";
    }

    @Override
    public String Perform(String duty) {
        return "Performing duty: " + duty;
    }

    @Override
    public String include(String service) {
        return "Including service: " + service;
    }

    @Override
    public String like(String item) {
        return "Liking item: " + item;
    }
}


// Concrete class Pg_Student, inherited from Student
class Pg_Student extends Student {
    private String Roll_no;
    private String Specialization;

    public Pg_Student(int aadhar_id, 
                      String name, 
                      int phone, 
                      String profession,
                      String Student_Id,
                      String Major,
                      int Semester,
                      String College,
                      int grade,
                      String Roll_no,
                      String Specialization) {

        // Call the constructor of the superclass (Student)
        super(aadhar_id, name, phone, profession, Student_Id, Major, Semester, College, grade);

        // Initialize the additional fields specific to Pg_Student
        this.Roll_no = Roll_no;
        this.Specialization = Specialization;
    }


    // Getter and setter for Roll_no
    public String getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(String Roll_no) {
        this.Roll_no = Roll_no;
    }

    // Getter and setter for Specialization
    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    // Additional method for Pg_Student
    public String SubmitThesis() {
        // Implementation for submitting a thesis
        return getName() + " (Roll No: " + Roll_no + ") from " + getCollege() + " has submitted their thesis in " + Specialization;
    }


}

class Faculty extends Staff {
    private String Faculty_Specialization;
    private String Section;
    private int No_of_Students;
    private String Qualification;

    public Faculty(int aadhar_id, 
                    String name, 
                    int phone, 
                    String profession, 
                    
                    String Emp_id,
                    String Emp_Role,
                    String Emp_Dept,
                    Float Emp_Salary,
                    int Emp_Experience,

                   String Faculty_Specialization,
                   String Section,
                   int No_of_Students,
                   String Qualification) {

        // Call the constructor of the superclass (Staff)
        super(aadhar_id,
                name,
                phone, 
                profession, 
                Emp_id,
                Emp_Role,
                Emp_Dept,
                Emp_Salary,
                Emp_Experience);

        // Initialize the additional fields specific to Faculty
        this.Faculty_Specialization = Faculty_Specialization;
        this.Section = Section;
        this.No_of_Students = No_of_Students;
        this.Qualification = Qualification;
    }

    // Getter and setter methods for Faculty_Specialization, Section, No_of_Students, and Qualification
    public String getFaculty_Specialization() {
        return Faculty_Specialization;
    }

    public void setFaculty_Specialization(String Faculty_Specialization) {
        this.Faculty_Specialization = Faculty_Specialization;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }

    public int getNo_of_Students() {
        return No_of_Students;
    }

    public void setNo_of_Students(int No_of_Students) {
        this.No_of_Students = No_of_Students;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    // Additional method for Faculty: Teach
    public String Teach(String Course) {
        return getName() + " is teaching " + Course;
    }

    // Additional method for Faculty: Assess
    public String Assess(String Student_Grade) {
        return getName() + " is assessing a student with grade: " + Student_Grade;
    }
}

class Technician extends Staff {
    private String Tech_type;

    public Technician(int aadhar_id, 
                      String name, 
                      int phone, 
                      String profession, 
                      String Emp_id,
                      String Emp_Role,
                      String Emp_Dept,
                      Float Emp_Salary,
                      int Emp_Experience,
                      String Tech_type) {

        // Call the constructor of the superclass (Staff)
        super(aadhar_id, name, phone, profession, Emp_id, Emp_Role, Emp_Dept, Emp_Salary, Emp_Experience);

        // Initialize the additional fields specific to Technician
        this.Tech_type = Tech_type;
    }

    // Getter and setter methods for Tech_type
    public String getTech_type() {
        return Tech_type;
    }

    public void setTech_type(String Tech_type) {
        this.Tech_type = Tech_type;
    }

    // Additional method for Technician: Maintain
    public String Maintain(String lab) {
        return getName() + " is maintaining the " + Tech_type + " equipment in the " + lab + " lab.";
    }

    // Additional method for Technician: Install
    public String Install(String system) {
        return getName() + " is installing a " + Tech_type + " system for " + system;
    }
}


public class Q2MainDriver {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student(12345, "John Doe", 555555555, "Student", "S123", "Computer Science", 2, "XYZ College", 85);

        // Create a Staff Member
        Staff staff = new Staff(67890, "Jane Smith", 666666666, "Staff", "E001", "Admin", "HR", 60000.0f, 3);

        // Create a Pg_Student
        Pg_Student pgStudent = new Pg_Student(11111, "Alice Johnson", 777777777, "PG Student", "P001", "Mathematics", 1, "ABC College", 90, "PG001", "Statistics");

        // Create a Faculty Member
        Faculty faculty = new Faculty(22222, "Dr. Robert Brown", 888888888, "Faculty", "F001", "Professor", "Computer Science", 90000.0f, 8, "Machine Learning", "Section A", 50, "Ph.D. in Computer Science");

        // Create a Technician
        Technician technician = new Technician(33333, "Mark Wilson", 999999999, "Technician", "T001", "Technician", "Lab Technician", 45000.0f, 4, "Electronics");

        // Display information about these individuals
        System.out.println(student.getName() + " is a " + student.getProfession());
        System.out.println(student.Register("UID123"));
        System.out.println(student.Attend("Computer Science Lecture"));
        System.out.println(student.Learn());

        System.out.println();

        System.out.println(staff.getName() + " is a " + staff.getProfession());
        System.out.println(staff.Register("UID456"));
        System.out.println(staff.Attend("HR Meeting"));
        System.out.println(staff.getPromotion());

        System.out.println();

        System.out.println(pgStudent.getName() + " is a " + pgStudent.getProfession());
        System.out.println(pgStudent.Register("UID789"));
        System.out.println(pgStudent.SubmitThesis());

        System.out.println();

        System.out.println(faculty.getName() + " is a " + faculty.getProfession());
        System.out.println(faculty.Register("UID101"));
        System.out.println(faculty.Teach("Advanced Machine Learning"));
        System.out.println(faculty.Assess("A+"));

        System.out.println();

        System.out.println(technician.getName() + " is a " + technician.getProfession());
        System.out.println(technician.Register("UID102"));
        System.out.println(technician.Maintain("Electronics Lab"));
        System.out.println(technician.Install("New Computer System"));
    }
}