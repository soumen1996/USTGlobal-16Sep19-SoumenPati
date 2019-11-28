function validate(){
    let userName=document.getElementById("username");
    let pass=document.getElementById("pass")
    if(userName.Value.trim()===""){
        

        return alert("Hello")
    }
    // else if(pass.Value.trim()==""){
    //     alert("Blank Username.")
    //     return false

    // }
    // else if(pass.Value.trim().length<5){

    //     alert("Password too Short");
    //     return false

    // }
    else{
        return true
    }
    // if(userName.value.trim()=='' || pass.value.trim()==''){
    //     alert("No Blank Values Are Allowed");
    //     return false
    // } 
    // else{
    //     true
    // }
}

// function myFunction() {
//     var x = document.getElementById("myInput");
//     if (x.type === "password") {
//       x.type = "text";
//     } else {
//       x.type = "password";
//     }
//   }
// function showMessage(){
    
//     alert("Hi Hello Welcome!!!");

// }