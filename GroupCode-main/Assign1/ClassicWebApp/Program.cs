using ClassicWebApp.Services;
var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllersWithViews();
builder.Services.AddTransient<IDbContext,StudentDbContext>();
var app = builder.Build();
app.MapDefaultControllerRoute();
app.Run();
