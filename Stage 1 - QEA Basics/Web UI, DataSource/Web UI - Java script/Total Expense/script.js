// Fill the code wherever necessary
var arr = [];
function validateExpense() {
    //DO NOT CHANGE THIS FUNCTION
    var month = document.getElementById('monthname').value;
    var items = document.getElementsByName('exp');

    if (month) {
        for (var i = 0; i < items.length; i++)
            arr[i] = items[i];
        if (validateMonthNameFormat(month)) {
            document.getElementById("result").innerHTML = "Expenses for the month of " + month + " include : <br/>" + arr[0].value + "<br/>" + arr[1].value + "<br/>" + arr[2].value + "<br/>" + arr[3].value + "<br/>" + arr[4].value;
        }
        else
            document.getElementById("result").innerHTML = "Invalid month name";
    }
    else
        document.getElementById("result").innerHTML = "Month name missing";
}

function validateMonthNameFormat(month) {
    // Fill your code here
    // find if the month is valid by checking if it is equal to "Jan" or "Feb" or "Mar" and so on..  
    // return true or false 

    switch (month) {
        case 'Jan':
            return true;
        case 'Feb':
            return true;

        case 'Mar':
            return true;

        case 'Apr':
            return true;

        case 'May':
            return true;

        case 'Jun':
            return true;

        case 'Jul':
            return true;

        case 'Aug':
            return true;

        case 'Sep':
            return true;

        case 'Oct':
            return true;

        case 'Nov':
            return true;

        case 'Dec':
            return true;

        default:
            return false;
    }

}












