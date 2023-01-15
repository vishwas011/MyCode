global using Microsoft.EntityFrameworkCore;

namespace ClassicWebApp.Services;

public class StudentDbContext : DbContext,IDbContext
{
    public DbSet<Course> Courses{get;set;}
    public DbSet<Student> Students { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Server=(localdb)\\DACIIT;Database=Student");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Course>()
                    .ToTable("Course")
                    .Property(c => c.Id)
                    .HasColumnName("courseId");
        modelBuilder.Entity<Student>()
                    .ToTable("Students")
                    .Property(s => s.Id)
                    .HasColumnName("rollNo");
        modelBuilder.Entity<Student>()
                    .Property(s=>s.CourseId)
                    .HasColumnName("couseId");
     
    }
}
