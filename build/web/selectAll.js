function check()
{
    var i;
    var b=document.getElementById("myForm").length;
    var a=document.getElementById("checkb").checked;
    for(i=1;i<=b;i++)
    {
    
    
    if(a===true)
    {
        document.getElementsByTagName("input")[i].checked=true;
    }
    else if(a===false)
    {
         document.getElementsByTagName("input")[i].checked=false;
    }
    
    
}
}
    
    

