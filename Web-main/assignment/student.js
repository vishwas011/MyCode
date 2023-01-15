var array=[]

var storeInfo=function(){

   var a=document.getElementById('x1').value
   var b=document.getElementById('x2').value
   var c=document.getElementById('x3').value

   var record={
    name:a,
    rollno:b,
    course:c
   }

   array[array.length]=record
  
}

var getInfo=function(){
    var x=""
    for(val of array){
    x=x+`
            <tr>
            <td>${val.name}</td>
            <td>${val.rollno}</td>
            <td>${val.course}</td>
           </tr>`

    }
    document.getElementById('result').innerHTML=`Your total Expense is ${x}`
}