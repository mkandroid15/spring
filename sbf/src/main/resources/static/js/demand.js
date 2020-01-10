/**
 * @author Mehmet
 */
$(function() {
	$("#consulting\\.consultingType").change(function() {
		var consType = $("#consulting\\.consultingType :selected").text();		
		if (consType == "OSGB") {
			$("#cons_other").attr("style", "display:none");
			$("#cons_osgh").attr("style", "display:block");
			$("#consulting\\.dangerState").prop('required', true);
			$("#consulting\\.subject").prop('required', false);
			$("#consulting\\.description").prop('required', false);
		} else {
			$("#cons_other").attr("style", "display:block");
			$("#cons_osgh").attr("style", "display:none");
			$("#consulting\\.dangerState").prop('required', false);
			$("#consulting\\.subject").prop('required', true);
			$("#consulting\\.description").prop('required', true);
		}
	});
	
});