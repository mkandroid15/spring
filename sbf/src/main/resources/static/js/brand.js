/**
 * 
 */

function selectAll() {
	var state = $("#class_Tumu").prop('checked');	
	for (var i = 1; i < 46; i++) {
		$("#class_" + i).prop("checked", state);
	}
}

function showDescription(classId) {		
	var description = getBrandClassDesc(classId);	
}

function getBrandClassDesc(classId) {
	var resturl = 'brand/getBrandDescription/' + classId;	
	if (classId > 0) {
		$.ajax({
			url : resturl,
			type : 'GET',			
			success : function(data) {				
				ShowMessage('Marka', data, 'ss');
				return data;
			},
			error : function(xhr, ajaxOptions, thrownError) {
				if (xhr.status = 404) {
					alert('Şu adres bulunamadı : ' + resturl);
				} else {
					alert('Restfull Hatası ' + thrownError);
				}
			}
		});
	}
	return null;
}


function callRest(resturl){
	$.ajax({
		url : resturl,
		type : 'GET',
		dataType : 'json',	
		contentType: "application/json",
		success : function(data) {
			var d = JSON.stringify(data);
			alert(d);
			alert(data.fee);
			return data;
		},
		error : function(xhr, ajaxOptions, thrownError) {
			if (xhr.status = 404) {
				alert('Şu adres bulunamadı : ' + resturl);
			} else {
				alert('Restfull Hatası ' + thrownError);
			}
		}
	});
}

function getCalculatedBrand() {
	var count = getSelectedCount();
	if (count > 0) {
		var resturl = 'brand/getBrandPrice/' + count;
		$.ajax({
			url : resturl,
			type : 'GET',
			dataType : 'json',
			contentType : "application/json",
			success : function(data) {				
				$("#fee").val(data.fee);
				$("#service").val(data.service);
				$("#total").val(data.total);
			},
			error : function(xhr, ajaxOptions, thrownError) {
				if (xhr.status = 404) {
					alert('Şu adres bulunamadı : ' + resturl);
				} else {
					alert('Restfull Hatası ' + thrownError);
				}
			}
		});
	} else {		
		$("#fee").val(0);
		$("#service").val(0);
		$("#total").val(0);
	}

	return null;
}

function getSelectedCount(){
	var count = 0;
	for (var i = 1; i < 46; i++) {
		if(isChecked("#class_" + i)){
			count++;
		}
	}
	return count;
}

$(':checkbox').change(function() {
	getCalculatedBrand();
}); 


