    function deleteChecked()
{

     var i=1;
    var b=document.getElementById("myForm").length;
    do
    {
    
    var a=document.getElementsByTagName("input")[i].checked;
    if(a===true)
    {
        document.write("done");
    }
    else if(a===false)
        {
        i++;
    }
    }while(i<=b)
}