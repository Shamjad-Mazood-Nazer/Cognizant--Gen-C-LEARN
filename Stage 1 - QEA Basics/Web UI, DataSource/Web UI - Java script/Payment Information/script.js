function replace() {

    var paymentModeDetails = document.getElementById("paymentModeDetails").value;

    var searchedWord = document.getElementById("searchedWord").value; // Fill your code here to get the element to be searched - by using the id "searchedWord" and store it in the variable "searchedWord"
    var replacingWord = document.getElementById("replacingWord").value; // Fill your code here to get the replacing element by using the id "replacingWord" and store it in the variable "replacingWord" 

    // HINT: use the above "paymentModeDetails" as sample to get "searchedWord" and "replacingWord"

    if (wordChecker(paymentModeDetails, searchedWord)) {
        paymentModeDetails = paymentModeDetails.replace(searchedWord, replacingWord);
        document.getElementById("msg").innerHTML = paymentModeDetails;

    }
    else {
        document.getElementById("msg").innerHTML = "Searched word not found";
    }

}

function wordChecker(paymentModeDetails, searchedWord) {
    // Fill your code
    // Find whether 'paymentModeDetails' contains 'searchedWord'. If found, return 'true' else return 'false'

    if (paymentModeDetails.match(searchedWord)) {
        return true;
    } else {
        return false;
    }


}