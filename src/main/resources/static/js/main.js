$('document').ready(function(){
	$('.table .editButton').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(natioanality, status){
		    $('#IdEdit').val(natioanality.id);
		    $('#nameEdit').val(natioanality.name);
		    $('#capitalEdit').val(natioanality.capital);
		    $('#updatedByEdit').val(natioanality.updatedBy);
		    $('#updatedOnEdit').val(natioanality.updatedOn.substr(0,10));
		} )
		$('#editModal').modal();
	});


	$('.table .deleteButton').on('click',function(event){
    	event.preventDefault();
    	var href = $(this).attr('href');
    	$('#deleteModal #deleteId').attr('href', href);
    	$('#deleteModal').modal();
    });
});