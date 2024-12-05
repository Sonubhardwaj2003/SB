class Subject{

    private String subId;
    private String name;
    private double maxMarks;
    private double marksobtained;

    // public Subject(){
    //     subId="2023b0101141";
    //     name="Mathematics";
    //     maxMarks=100;
    //     marksobtained=92;
    // }
    public Subject(String SI,String n,double mm,double mo){
        this.subId=SI;
        this.name=n;
        setmaxMarks(mm);
        setmarksObtained(mo);
    }

    public String getsubId(){
        return subId;
    } 
    public String getName(){
        return name;
    }
    public double getmaxMarks(){
         return maxMarks;
    } 
    public double getmarksObtained(){
        return marksobtained;
    }

    public void setmaxMarks(double mm){
        maxMarks=mm;
    }
    public void setmarksObtained(double mo){
        marksobtained=mo;
    }

    public String toString(){
        return "\nsubject Id : "+subId+"\nSubject NAme  : "+name+"\nMaximum Marks : "+maxMarks+"\nMarks Obtain : "+marksobtained;
    }

}

public class _6Subject {
    public static void main(String[] args) {
        Subject s[]=new Subject[3];
        s[0]=new Subject("Ds5263", "DS", 100, 90);
        s[1]=new Subject("math7623", "Mathematice", 100, 97);
        s[2]=new Subject("algo286", "Algorithm", 100, 85);

        for(Subject sub:s){
            System.out.println(sub);
        }
    }
}
