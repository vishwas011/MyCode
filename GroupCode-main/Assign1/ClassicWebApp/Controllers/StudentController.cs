using Microsoft.AspNetCore.Mvc;
namespace ClassicWebApp.Controllers;
using Services;

public class StudentController : Controller
{
    public IActionResult Index([FromServices]Services.IDbContext obj)
    {
        ViewBag.Course=obj.Courses;
        return View("Courses");
    }
    [HttpPost]
    public IActionResult Detail(int Cid,[FromServices]Services.IDbContext obj)
    {

        var std=obj.Courses
                    .Where(c=>c.Id==Cid)
                    .Include(c=>c.Students)
                    .FirstOrDefault();
        ViewBag.Student=std.Students;
        return View("Students");
    }

    


}