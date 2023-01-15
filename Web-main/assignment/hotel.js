function myFuntion(){
    var a = document.getElementById("p1").value;
    var b = document.getElementById("p2").value;
    var c = document.getElementById("p3").value;
    
    var expense;
    if(c=="Deluxe"){
        if(b>5){

            expense = a * 2000 * b-a*250*b
        }
        else
            expense = a * 2000*b;
    }

    if(c=="Bussiness"){
        
        if(b>3){
            expense =a * 1000 * b - a * 100 * b;
        }
        else
            expense = a * 1000 * b;
    }
    if(c=="Economy")
    {
        expense = a * 500 * b;
    }

    document.getElementById('p4').innerHTML=expense
}