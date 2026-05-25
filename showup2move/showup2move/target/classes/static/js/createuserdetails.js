function validateSports() {
    var checkboxes = document.querySelectorAll('input[name="sports"]:checked');
    if (checkboxes.length === 0) {
        alert("Please select at least one sport.");
        return false; // Prevent form submission
    }

    return true;
}