/**
 * @author Mehmet
 *
 * 17:37:23
 */

$(function() {
	$("#customer\\.partnerTuru").change(function() {
		var custType = $('#customer\\.partnerTuru option:selected').val();
		if (custType == 'OZEL') {			
			setCustomer(true);
		} else if (custType == 'TUZEL') {
			setCustomer(false);
		}
	});
});

function setCustomer(isSpecial){
	$("#customer\\.tcKimlikNo").prop("disabled", !isSpecial);
	$("#customer\\.tcKimlikNo").prop('required', isSpecial);
	if (!isSpecial) {
		$('#customer\\.tcKimlikNo').val(0);
	}
	$("#customer\\.vergiNo").prop("disabled", isSpecial);
	$("#customer\\.vergiNo").prop('required', !isSpecial);
	if (isSpecial) {
		$('#customer\\.vergiNo').val(0);
		$('#customer\\.unvan').val('');
	}
	$("#customer\\.unvan").prop("disabled", isSpecial);
	$("#customer\\.unvan").prop('required', !isSpecial);
}

function maxLengthCheck(object) {
    if (object.value.length > object.maxLength)
      object.value = object.value.slice(0, object.maxLength)
  }