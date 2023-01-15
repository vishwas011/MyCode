var calculate = ()=>
{

    //alert("hello")
   var num = document.getElementById('x1').value
   var msg = document.getElementById('x2').value
   var number = parseInt(num);
   if("Check If Prime!"== msg){
        if(number==2)
            document.getElementsByTagName('h4')[0].innerHTML="Number is Prime"
        if(number==3)
            document.getElementsByTagName('h4')[0].innerHTML="Number is Prime"
        for(var i=3;i<number;i++){
                if(number%i==0){
                    document.getElementsByTagName('h4')[0].innerHTML="Number is not Prime"
                     break;
        }
     document.getElementsByTagName('h4')[0].innerHTML="Number is Prime";
        
    }
}
    if("Check If Even!"== msg){
        if(number%2==0)
        document.getElementsByTagName('h4')[0].innerHTML="Number is Even"
        else
        document.getElementsByTagName('h4')[0].innerHTML="Number is odd"
    }
    if("Check If Odd!"== msg){
        if(number%2==1)
        document.getElementsByTagName('h4')[0].innerHTML="Number is Odd"
        else
        document.getElementsByTagName('h4')[0].innerHTML="Number is Even"
    }
    if("Reverse The Number"== msg){
        var rev = 0;
        while(number!=0){
            var digit = number%10;
            rev = rev*10+digit;
            number = Math.floor(number/10);
        }
        document.getElementsByTagName('h4')[0].innerHTML=rev

    }
    if("Sum Of Digits"== msg){
        var Sum = 0;
        while(number!=0){
            var digit= number%10
            Sum = Sum+digit
            number=Math.floor(number/10);            
        }   
        document.getElementsByTagName('h4')[0].innerHTML=Sum
    }
}