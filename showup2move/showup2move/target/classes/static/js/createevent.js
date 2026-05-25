function validateSports() {
    var radios = document.querySelectorAll('input[name="sports"]:checked');
    if (radios.length === 0) {
        alert("Please select one sport.");
        return false; // Prevent form submission
    }

    return true;
}