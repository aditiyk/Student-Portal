/**
 * 
 */
 
  
    var name = document.getElementById('name').value;
    if(name==""){
        document.getElementById('msg').innerHTML="Name Must Not Be Empty!";
        return false;
    }
    var pass = document.getElementById('pass').value;
    if(pass.length==""){
     document.getElementById('msg').innerHTML="Password must not Be Empty!";
    } 

  