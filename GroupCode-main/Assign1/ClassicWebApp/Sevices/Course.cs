namespace ClassicWebApp.Services;

public class Course
{
    public int Id{get;set;}
    public string CourseName{get;set;}  
    public List<Student> Students {get;set;}

}