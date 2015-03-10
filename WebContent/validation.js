function validateForm(inputvalue) {
	var number1 = document.forms["frm"]["number1"].value;
	var number2 = document.forms["frm"]["number2"].value;
	var pattern = /^[-]?[0-9]+([.]?[0-9]+)?$/;
	valid = true;

	if (!pattern.test(number1)) {
		document.getElementById("numb1").innerHTML = "*incorrect data";
		valid = false;
	}

	if (!pattern.test(number2)) {
		document.getElementById("numb2").innerHTML = "*incorrect data";
		valid = false;
	}

	if (pattern.test(number1)) {
		document.getElementById("numb1").innerHTML = "";
	}

	if (pattern.test(number2)) {
		document.getElementById("numb2").innerHTML = "";
	}

	return valid;
}