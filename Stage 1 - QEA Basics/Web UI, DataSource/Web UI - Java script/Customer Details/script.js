// Fill the code wherever necessary
var arr=[];
var character="";
var name="";

function searchGenres()
{
    name=document.getElementById('name').value;
    character=document.getElementById('character').value; //Fill your code here to get the value - by using the element id "character" and store it in the variable "character"
     // HINT: use the above "name" as sample to get "character"
    
    var items=document.getElementsByName("genres");
    
    for(var i=0; i<items.length; i++)
        arr[i]=items[i].value;
       
    if(name && character)
    {
        if(validateCharacter(character))
        {
            if(validateGenresBasedOnCharacter(character))
                document.getElementById("result").innerHTML = "Hi, "+name+". There are genres that start with character "+character;
            else
                document.getElementById("result").innerHTML = "Hi, "+name+". There are no genres that start with character "+character;
        }
        else
            document.getElementById("result").innerHTML = "Invalid character";
    }
    else
        document.getElementById("result").innerHTML = "Customer name or character missing" ;
}   

function validateCharacter(character)
{
    var pattern = /[A-Z]$/;
    // Fill your code here
    // HINT : use the syntax => character.match(pattern)
    // find whether 'character' is an alphabet. If so, return true, else return false
    
    if (character.match(pattern)) {
        return true;
    } else {
        return false;
    }
    
}

function validateGenresBasedOnCharacter(character)
{
    for(var i=0; i<arr.length; i++)  // this is the for loop that iterates through the array 'arr'
    {	
        // Fill your code here
        // Hint: during each iteration, check if the element starts with that character by using the syntax => arr[i].startsWith(character)
    	// return true on finding the match
    	
    	if (arr[i].startsWith(character)) {
    	    return true;
    	}
 	
    }
    return false;
}