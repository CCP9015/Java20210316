package fju.edu.school;

public class GraduateStudent extends Student implements Mailer{
    int thesis;
    public GraduateStudent(String id, String name ,int english, int math,int thesis){
        super(id ,name ,english ,math);
        this.thesis = thesis;
  }
  @Override
  public void print(){
      System.out.println(id + "\t" +name + "\t" + english + "\t" + math + "\t" + thesis + "\t" +(thesis+english+math)/3);
  }


    public void mail() {
        System.out.println("hello");

    }


    public void rule() {

    }
}
