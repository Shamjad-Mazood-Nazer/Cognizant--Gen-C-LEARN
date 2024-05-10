// Fill the code wherever necessary

var assetArray = [];
function displayAsset() {
    var assetId = document.getElementById('asset_id').value;
    var type = document.getElementById('type').value; //Fill your code here to get the value - by using the element id "type" and store it in the variable "type"
    var supplier = document.getElementById('supplier').value; //Fill your code here to get the value - by using the element id "supplier" and store it in the variable "supplier" 
    var manufacturer = document.getElementById('manufacturer').value; //Fill your code here to get the value - by using the element id "manufacturer" and store it in the variable "manufacturer"
    // HINT: use the above "assetId" as sample to get "type", "supplier" and "manufacturer"

    if (validateAssetDetails(assetId, type, supplier, manufacturer))
        document.getElementById('result').innerHTML = manufacturer + " is the manufacturer of Asset ID : " + assetId;
    else
        document.getElementById('result').innerHTML = "Asset ID (or) Asset Type (or) Supplier Name (or) Manufacturer entered is incorrect";
}

function validateAssetDetails(assetId, type, supplier, manufacturer) {
    var characterPattern = /^[A-Za-z ]+$/;
    var numberPattern = /^[0-9]+$/;

    // Fill your code here
    // HINT : use the syntax => type.match(characterPattern) to check whether type contains only alphabets 
    // Similarly check for supplier and manufacturer. 

    if (type.match(characterPattern)) {
        return true;
    }
    else {
        return false;
    }

    if (supplier.match(characterPattern)) {
        return true;
    } else {
        return false;
    }

    if (supplier.match(characterPattern)) {
        return true;
    } else {
        return false;
    }

    // Use the syntax => assetId.match(numberPattern) to check whether it contains only numbers
    // If all the conditions are met, return true. Else, return false.

    if (assetId.match(numberPattern)) {
        return true;
    } else {
        return false;
    }

}


