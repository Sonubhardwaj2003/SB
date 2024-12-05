// package class_Object;

class Student{
    public int roll;
    public String name;
    public String course;
    float m1,m2,m3;

    public String details(){
        return "Roll no. : "+roll+"\n"+"Name : "+name+"\n"+"Course : "+course;
    }
    public float total(){
        return m1+m2+m3;
    }
    public float average(){
        return (m1+m2+m3)/3;
    }
    public String grade(){
        if(average()>60)
            return "A";
        else
            return "B";   

    }
}

public class _5classStudent {
    public static void main(String[] args) {
        Student S=new Student();

        S.roll=252;
        S.name="Sonu Bhardwaj";
        S.course="BTech in CSE";
        S.m1=94;
        S.m2=90;
        S.m3=80;

        System.out.println("Details of student Are : "+S.details());
        System.out.println("Totl : "+S.total());
        System.out.println("Avearge is : "+S.average());
        System.out.println("grade is : "+S.grade());
    }
}
