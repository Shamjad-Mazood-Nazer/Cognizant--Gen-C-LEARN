function displayAddress() {

    var name = document.getElementById("name").value;

    var street = document.getElementById("street").value; // Fill your code to get the street element - by id "street" and store it in the variable "street"
    var city = document.getElementById("city").value; // Fill your code to get the city element - by id "city" and store it in the variable "city" 

    // HINT: use the above "name" as sample to get "street" and "city"

    // Fill your code here

    // if 'name' or 'street' or 'city' is empty then display error message using => document.getElementById("msg").innerHTML = "Address cannot be empty"; 
    if (name === '' || street === '' || city === '') {
        document.getElementById("msg").innerHTML = "Address cannot be empty";
    }
    if (name !== '' || street !== '' || city !== '') {
        document.getElementById("msg").innerHTML = name + " " + street + " " + city;

    }

    // if 'name' or 'street' or 'city' is not empty then display the address using => document.getElementById("msg").innerHTML = name +" "+street+ " "+city;


}