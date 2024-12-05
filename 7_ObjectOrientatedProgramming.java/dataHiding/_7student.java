class Student{
    private String roll;
    private String name;
    private String department;
    private String subject;

    // public Student(){
    //     roll="2023b0101141";
    //     name="Sonu bhardwaj";
    //     department="CSE";
    //     subject="Data Structure";
    // }
    public Student(String r,String n,String d,String sub){
        this.roll=r;
        this.name=n;
        this.department=d;
        this.subject=sub;
    }

    public String getroll(){
        return roll;
    } 
    public String getName(){
        return name;
    }
    public String getdepartment(){
         return department;
    } 
    public String getsubject(){
        return subject;
    }

    public String toString(){
        return "\nStudent Rollnum : "+roll+"\nStudent Name : "+name+"\nDepartment : "+department+"\nSubject : "+subject;
    }
}

public class _7student {
    public static void main(String[] args) {
        Student s[]=new Student[4];

        s[0]=new Student("2023b010114", "Sonu bhardwaj", "CSE", "Physics group");
        s[1]=new Student("2023b010266", "Harsh", "CSE-AIML", "Chemistry group");
        s[2]=new Student("2023b0101820", "Sarthak", "CSE-IT", "Physics group");
        s[3]=new Student("2023b010211", "Harshit", "CSE-AIML", "Chemistry group");

        for(Student su:s){
            System.out.println(su);
        }
    }
}
