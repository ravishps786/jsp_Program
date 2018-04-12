function deleteCheck()
{
    var i=1;
    var b=document.getElementById("myForm").length;
    do
    {
    
    var a=document.getElementsByTagName("input")[i].checked;
    if(a===true)
    {
        document.getElementById("demo").innerHTML="<%=rs.getString(1)%>";
    }
    else if(a===false)
        {
        i++;
    }
    }while(i<=b)
}