function nameValidation(){
var name=document.getElementById("txtName").value;
var namePattern ="^[A-Za-z]+$";
if(!userValue.match(namePattern))
document.getElementById(errorName).innerHTML="Name shoould be in letters"
else
document.getElementById(errorName.innerHtml)="";
}

