$(function() {
	$("#partnetTuru").change(function() {
		var custType = $('#partnetTuru option:selected').val();
		if (custType == 'OZEL') {
			setDisableEnable(true);
		} else if (custType == 'TUZEL') {
			setDisableEnable(false);
		}
	});
});

function setDisableEnable(isSpecial) {
	$("#tcKimlikNo").prop("disabled", !isSpecial);
	$("#tcKimlikNo").prop('required', isSpecial);
	if (!isSpecial) {
		$('#tcKimlikNo').val(0);
	}
	$("#vergiNo").prop("disabled", isSpecial);
	$("#vergiNo").prop('required', !isSpecial);
	if (isSpecial) {
		$('#vergiNo').val(0);
		$('#unvan').val('');
	}
	$("#unvan").prop("disabled", isSpecial);
	$("#unvan").prop('required', !isSpecial);

}

$(function() {
	$("#meslekTuru").change(function() {
		var meslekTuru = $('#meslekTuru option:selected').val();
		if (meslekTuru == 'DIGER') {
			$("#meslek").prop("disabled", false);
			$("#meslek").prop('required', true);
		} else {
			$("#meslek").prop("disabled", true);
			$("#meslek").prop('required', false);
			$('#meslek').val('');
		}
	});
});

$(document).ready(function() {
	getCities();
});

$(function() {
	$('#citiesCombo').change(function() {
		getDistricts($(this).val());
		var districtsCombo = $('#districtsCombo');
		districtsCombo.attr("placeholder", "Lütfen seçiniz!");
	})
});

function getCities() {
	if ($('#citiesCombo').length) {
		var resturl = 'public/getCitiesList';
		$
				.ajax({
					url : resturl,
					type : 'GET',
					dataType : 'json',
					success : function(data) {
						var cityCombo = $('#citiesCombo');
						cityCombo
								.append('<option value="-1" disabled selected>İl seçiniz</option>');
						$.each(data, function(i, item) {
							cityCombo.append($('<option></option>')
									.val(item.id).html(item.name));
						});
					},
					error : function(xhr, ajaxOptions, thrownError) {
						if (xhr.status = 404) {
							alert('Şu adres bulunamadı : ' + resturl);
						} else {
							alert('Restfull İlçe Hatası ' + thrownError);
						}
					}
				});
	}
}

function getDistricts(cityCode) {
	var resturl = 'public/getDictrictsList/' + cityCode;
	if (cityCode > 0) {
		$
				.ajax({
					url : resturl,
					type : 'GET',
					dataType : 'json',
					success : function(data) {
						var districtsCombo = $('#districtsCombo');
						districtsCombo
								.empty()
								.append(
										'<option value="-1" disabled selected>İlçe seçiniz</option>');
						;
						$.each(data, function(i, item) {							
							districtsCombo.append($('<option></option>').val(
									item.districtid).html(item.name));
						});
					},
					error : function(xhr, ajaxOptions, thrownError) {
						if (xhr.status = 404) {
							alert('Şu adres bulunamadı : ' + resturl);
						} else {
							alert('Restfull İlçe Hatası ' + thrownError);
						}
					}
				});
	}
}




function ShowMessage(title, context, badge) {
	$('#messageModalBadge').text('');
	if (title != null && context != null) {
		$('#messageModalLabel').text(title);
		$('#messageModalContext').html(context);
		if (badge > 0) {
			$('#messageModalBadge').text(badge);			
		} 
		$('#messageModal').modal();
	}
}

function isChecked(field) {
	  return $(field).is(':checked')?true:false;
}


