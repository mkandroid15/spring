/**
 * 
 */
$(function() {
	$("#selectedPolicyType").change(function() {		
		var header = $("#selectedPolicyType :selected").text();
		$('#policyHeader').text(header);
		if (header == "Trafik" || header == "Kasko") {			
			$("#desc").attr("style", "display:block");
		} else {			
			$("##desc").attr("style", "display:none");
		}
	});
});


$(function() {
	$("#payeeExist1").change(function() {
		if (this.checked) {
			$("#rehinDetay").attr("style", "display:block");
		} else {
			$("#rehinDetay").attr("style", "display:none");
		}
	});
});

$(function() {
	$("#plakaHarf").keyup(function() {
		 $(this).val( $(this).val().toUpperCase() );
	});
});

function getStyle(isShow) {
	return isShow ? "display:block" : "display:none";
}

function show_plakaDiv(isShow){	
	$("#plakaDiv").attr("style", getStyle(isShow));	
	$("#plakaHarf").prop('required', isShow);
	$("#plakaHarf").prop('disabled', !isShow);
	$("#plakaSayi").prop('min', isShow ? 1 : 0);
	$("#plakaIl").prop('min', isShow ? 1 : 0);
}

function show_plakaSifirDiv(isShow){
	$("#plakaSifirDiv").attr("style", getStyle(isShow));
	$("#plakaSifirIl").prop('min', isShow ? 1 : 0);
}

function show_asbisNoDiv(isShow){	
	$("#asbisNoDiv").attr("style", getStyle(isShow));
	$("#asbisNo").prop('required', isShow);
	$("#asbisNo").prop('disabled', !isShow);
}

function show_belgeSeriDiv(isShow){	
	$("#belgeSeriDiv").attr("style", getStyle(isShow));
	$("#belgeSeriNo").prop('required', isShow);
	$("#belgeSeriNo").prop('disabled', !isShow);
	$("#belgeSeriNo").prop('min', isShow ? 1 : 0);
}

function show_markaDiv(isShow){	
	$("#markaDiv").attr("style", getStyle(isShow));
	$("#marka").prop('required', isShow);
	$("#marka").prop('disabled', !isShow);
}

function show_markaKoduDiv(isShow){	
	$("#markaKoduDiv").attr("style", getStyle(isShow));
	$("#markaKodu").prop('required', isShow);
	$("#markaKodu").prop('disabled', !isShow);
}

function show_modelYiliDiv(isShow){	
	$("#modelYiliDiv").attr("style", getStyle(isShow));
	$("#modelYili").prop('required', isShow);
	$("#modelYili").prop('disabled', !isShow);
}

function show_motorNoDiv(isShow){	
	$("#motorNoDiv").attr("style", getStyle(isShow));
	$("#motorNo").prop('required', isShow);
	$("#motorNo").prop('disabled', !isShow);
}

function show_saseNoDiv(isShow){
	$("#saseNoDiv").attr("style", getStyle(isShow));
	$("#saseNo").prop('required', isShow);
	$("#saseNo").prop('disabled', !isShow);
}

function show_policeBitisVadesiDiv(isShow){
	$("#policeBitisVadesiDiv").attr("style", getStyle(isShow));
	$("#policeBitisVadesi").prop('required', isShow);
	$("#policeBitisVadesi").prop('disabled', !isShow);
}

function show_referans(isShow){
	$("#referans").attr("style", getStyle(isShow));
	$("#referansSigortaSirketi").prop('required', isShow);
	$("#referansAcenteNo").prop('required', isShow);
	$("#referansPoliceNo").prop('required', isShow);
	$("#referansAcenteNo").prop('disabled', !isShow);
	$("#referansPoliceNo").prop('disabled', !isShow);
}

$(function() {
	$("#processType").change(function() {
		var selected = $("#processType :selected").text();		
		if (selected == "Yeni") {
			show_plakaDiv(true);
			show_plakaSifirDiv(false);
			show_asbisNoDiv(true);
			show_belgeSeriDiv(false);
			show_markaDiv(true);
			show_markaKoduDiv(true);
			show_modelYiliDiv(true);
			show_motorNoDiv(false);
			show_saseNoDiv(false);
			show_policeBitisVadesiDiv(false);
			show_referans(false);
		}
		else if(selected == "Sifir"){
			show_plakaDiv(false);
			show_plakaSifirDiv(true);
			show_asbisNoDiv(false);
			show_belgeSeriDiv(false);
			show_markaDiv(true);
			show_markaKoduDiv(true);
			show_modelYiliDiv(true);
			show_motorNoDiv(true);
			show_saseNoDiv(true);
			show_policeBitisVadesiDiv(false);
			show_referans(false);
		}
		else if(selected == "Yenileme"){
			show_plakaDiv(true);
			show_plakaSifirDiv(false);
			show_asbisNoDiv(false);
			show_belgeSeriDiv(true);
			show_markaDiv(false);
			show_markaKoduDiv(false);
			show_modelYiliDiv(false);
			show_motorNoDiv(false);
			show_saseNoDiv(false);
			show_policeBitisVadesiDiv(true);
			show_referans(true);
		}		
		else{
			show_plakaDiv(false);
			show_plakaSifirDiv(false);
			show_asbisNoDiv(false);
			show_belgeSeriDiv(false);
			show_markaDiv(false);
			show_markaKoduDiv(false);
			show_modelYiliDiv(false);
			show_motorNoDiv(false);
			show_saseNoDiv(false);
			show_policeBitisVadesiDiv(false);
			show_referans(false);
		}
	});
});


$(function () {
	  $("#plakaIl").keydown(function () {
	    // Save old value.
	    $(this).data("old", $(this).val());
	  });
	  $("#plakaIl").keyup(function () {
	    // Check correct, else revert back to old value.
	    if (parseInt($(this).val()) <= 81 && parseInt($(this).val()) > 0)
	      ;
	    else
	      $(this).val($(this).data("old"));
	  });
	});

$(function () {
	  $("#plakaSayi").keydown(function () {
	    // Save old value.
	    $(this).data("old", $(this).val());
	  });
	  $("#plakaSayi").keyup(function () {
	    // Check correct, else revert back to old value.
	    if (parseInt($(this).val()) <= 9999 && parseInt($(this).val()) > 0)
	      ;
	    else
	      $(this).val($(this).data("old"));
	  });
	});

$(function () {
	  $("#plakaSifirIl").keydown(function () {
	    // Save old value.
	    $(this).data("old", $(this).val());
	  });
	  $("#plakaSifirIl").keyup(function () {
	    // Check correct, else revert back to old value.
	    if (parseInt($(this).val()) <= 81 && parseInt($(this).val()) > 0)
	      ;
	    else
	      $(this).val($(this).data("old"));
	  });
	});

$(function () {
	  $("#belgeSeriNo").keydown(function () {
	    // Save old value.
	    $(this).data("old", $(this).val());
	  });
	  $("#belgeSeriNo").keyup(function () {
	    // Check correct, else revert back to old value.
	    if (parseInt($(this).val()) <= 999999 && parseInt($(this).val()) > 0)
	      ;
	    else
	      $(this).val($(this).data("old"));
	  });
	});







